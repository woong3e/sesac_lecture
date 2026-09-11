// 1. `cart`에 `'키보드'`, `'마우스'`를 넣습니다. ( 배열)
const cart = ['키보드', '마우스'];
// 2. Spread로 `'모니터'`가 추가된 `updatedCart`를 만듭니다.
const updatedCart = [...cart, '모니터'];
// 3. `order` 객체에 `id: 1`, `status: '결제 대기'`를 넣습니다.
const order = { id: 1, status: '결제 대기' };
// 4. Spread로 기존 값은 유지하고 `status`만 `'결제 완료'`로 바꾼 `completedOrder`를 만듭니다.
const completedOrder = { ...order, status: '결제완료' };
// 5. Rest 파라미터를 사용해 전달받은 가격의 합계를 반환하는 `getTotal`을 작성합니다.
const getTotal = (...prices) => {
  let total = 0;
  for (const price of prices) {
    total += price;
  }
  console.log(total);
};
// 6. `updatedCart`, 두 주문 객체(order, completedOrder), `getTotal(50000, 30000, 200000)`의 결과를 출력합니다.

console.log(updatedCart);
console.log(order);
console.log(completedOrder);
getTotal(50000, 30000, 200000);
