// Date는 날짜와 시간을 표현하는 객체이며 new Date()로 생성한다.

const now = new Date(); // 생성 당시의 시점을 나타내는 Date 객체 생성

console.log(now); // 2026-09-11T00:13:58.766Z

// toLocaleString('ko-KR) : 한국에서 익숙한 표시 형식의 문자열로 반환

console.log("한국어 표시:", now.toLocaleString("ko-KR")); // 한국어 표시: 2026. 9. 11. 오전 9:13:58

const year = now.getFullYear();
const month = now.getMonth() + 1; // 반환하는 우러 번호가 0부터 시작한다.
const date = now.getDate();

console.log(`${year}년 ${month}월 ${date}일`); // 2026년 9월 11일
