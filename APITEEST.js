let API_URL_OpenWeatherMap = `http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst=${API_KEY}`;

function getData() {
  fetch(API_URL_OpenWeatherMap)     	// Promise<Response>반환  -> res로 전달
  .then(function(res) {       
    return res.json()			// json() 메서드 적용  -> json으로 전달
  })
  .then(function(json) {
    renderWeatherData(json);		// json형태의 데이터를 다른함수로 넘겨줌
  });
}

function renderWeatherData(data) {
  let now = new Date(); 
  date.textContent = `${moment(now).format(`dddd, Do MM YYYY`)}`;
  temp.textContent = `${Math.round(Number(data.main.temp) - 273.15)}°C`;
  // ...생략
  changeIcon(data);  
}
//출처: https://joooing.tistory.com/entry/날씨-APP-만들기-OpenWeather-API-활용 [joooing:티스토리]