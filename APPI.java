/* WeatherSet.java */

package pkgWeatherMonitor;

import java.util.Calendar;
import java.util.Date;

public class WeatherSet {
    private int pop;
    private int sky;
    private Date baseDate = null;
    private Date fcstDate = null;

    public WeatherSet(int p, int s, Date bd) {
        pop = p;
        sky = s;
        baseDate = bd;
        Calendar calBase = Calendar.getInstance();
        calBase.setTime(baseDate);
        calBase.add(Calendar.HOUR_OF_DAY, 4);
        fcstDate = calBase.getTime();
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int p) {
        pop = p;
    }
    
    public int getSkyValue(){
        return sky;
    }

    public String getSky() {
        String retMsg = null;
        switch (sky) {
        case 1:
            retMsg = "맑음";
            break;
        case 2:
            retMsg = "구름 조금";
            break;
        case 3:
            retMsg = "구름 많음";
            break;
        case 4:
            retMsg = "흐림";
            break;
        default:
            retMsg = "Error";
            break;
        }
        return retMsg;
    }

    public Date getBaseDate() {
        return baseDate;
    }
    
    public Date getFcstDate() {
        return fcstDate;
    }

    public void setSky(int s) {
        sky = s;
    }
}
/* WeatherFetcher.java */

package pkgWeatherMonitor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WeatherFetcher {
    private final int BASE_DATE = 3;
    private final int BASE_TIME = 5;
    private final int NX = 7;
    private final int NY = 9;
    private final String[] uri = {
            "http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastSpaceData?ServiceKey=",
            "xxxx", //service key
            "&base_date=", "", "&base_time=", "", "&nx=", "", "&ny=", "", "&_type=json"
    };
    
    private Calendar calBase = null;
    private int hour;
    private int lastBaseTime;

    private JakeJsonParser jjp = null;

    public WeatherFetcher() {
        jjp = JakeJsonParser.getInstance();
        calBase = Calendar.getInstance(); // 현재시간 가져옴
        calBase.set(Calendar.MINUTE, 0); // 분, 초 필요없음
        calBase.set(Calendar.SECOND, 0);
        hour = calBase.get(Calendar.HOUR_OF_DAY);
        lastBaseTime = getLastBaseTime(hour);
    }

    private int getLastBaseTime(int t) {
        if (t >= 0) {
            if (t < 2) {
                calBase.add(Calendar.DATE, -1);
                calBase.set(Calendar.HOUR_OF_DAY, 23);
                return 23;
            } else {
                calBase.set(Calendar.HOUR_OF_DAY, t - (t + 1) % 3);
                return t - (t + 1) % 3;
            }
        } else
            return -1;
    }

    private String getBaseTime() {
        if (lastBaseTime / 10 > 0) // 두자리수이면
            return lastBaseTime + "00";
        else // 한자리수이면
            return "0" + lastBaseTime + "00";
    }

    public WeatherSet fetchWeather(String nx, String ny) {
        WeatherSet ws = null;
        String sUrl = new String();
        int pop = -1, sky = -1;
        uri[BASE_DATE] = new SimpleDateFormat("yyyyMMdd").format(calBase.getTime());
        uri[BASE_TIME] = getBaseTime();
        uri[NX] = nx;
        uri[NY] = ny;
        for (int i = 0; i < uri.length; i++)
            sUrl += uri[i];
        
        JSONArray jsonArr = jjp.getWeatherJSONArray(sUrl);

        for (int i = 0; i < jsonArr.size(); i++) {
            JSONObject jobj = (JSONObject) jsonArr.get(i);
            if (((String) jobj.get("category")).equals("POP"))
                pop = (int) (long) jobj.get("fcstValue"); // JSON에서 ""로 감싸지지않은 값은 long 형이므로 casting 필수!
            else if (((String) jobj.get("category")).equals("SKY"))
                sky = (int) (long) jobj.get("fcstValue");
        }
        if (pop != -1 && sky != -1){
            Date bd = calBase.getTime();
            ws = new WeatherSet(pop, sky, bd);
        }
        return ws;
    }
}
/* WthMonitorMain.java */

package pkgWeatherMonitor;

import java.text.SimpleDateFormat;

public class APPI {
    public static void main(String[] args) {
        String[] location = { "충청남도", "천안시서북구", "부성동" };
        Coord coLocationCode = null;
        WeatherSet weather = null;
        LocationCodeFetcher lcf = new LocationCodeFetcher();
        WeatherFetcher wf = new WeatherFetcher();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 정각");
        
        coLocationCode = lcf.fetchLocationCode(location);
        System.out.println("location code : " + coLocationCode.getSx() + ", " + coLocationCode.getSy());
        weather = wf.fetchWeather(coLocationCode.getSx(), coLocationCode.getSy());
        System.out.println("발표시각 : " + sdf.format(weather.getBaseDate()));
        System.out.println(sdf.format(weather.getFcstDate()) + "의 강수확률은 " + weather.getPop() + "%, 하늘은 " + weather.getSky() + "입니당ㅎ");
    }
}