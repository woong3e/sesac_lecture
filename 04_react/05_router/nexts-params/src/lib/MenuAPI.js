import menus from '@/data/menu-detail.json';

// 모든 메뉴 데이터 조회
export function getMenuList() {
  return menus;
}

// menuCode로 메뉴 하나 조회
export function getMenuByMenuCode(menuCode) {
  /* 경로 파라미터로 menuCode를 전달 받는다.
URL에서 읽어온 값은 문자열이므로 숫자로 변환해서 비교한다.

find: 조건에 맞는 첫 번째 요소 한 개를 반환한다.
    */
  return menus.find((menu) => menu.menuCode === Number(menuCode));
}

export function searchMenu(searchMenuName) {
  // includes(): 문자열에 검색어가 포함되어 있는지 true/false로 반환한다.

  return menus.filter((menu) => menu.menuName.includes(searchMenuName));
}
