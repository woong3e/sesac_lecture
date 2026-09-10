/* Maht 표준 빌트인 객체
수학 계산기능을 제공하며 new로 만들지 않고 Math.메서드()로 바로 사용한다.
*/

// 1. 반올림 내림 올림
// round() : 반올림 후 정수 반환
console.log(Math.round(3.6)); // 4
// floor() : 내림 후 정수 반환
console.log(Math.floor(3.6));
// ceil() : 올림 후 정수 반환
console.log(Math.ceil(3.6));

// Math.random
// random() : 실행할때마다 0이상 1미만의 임의의 실수를 반환한다.
const randomValue = Math.random();
console.log(randomValue); //0.549677825184288, 0.9930641684965827 ...

const zeroToNine = Math.floor(randomValue * 10);
console.log(zeroToNine);
const oneToTen = zeroToNine + 1;
console.log(oneToTen);

// 배열에서 무작위 요소 선택
const menus = ["비빔밥", "우동", "김밥"];
const menuIndex = Math.floor(Math.random() * menus.length);
console.log(`선택인덱스: ${menuIndex}, 추천메뉴: ${menus[menuIndex]}`);
