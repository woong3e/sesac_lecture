export const fetchUsers = async () => {
  const res = await fetch('https://jsonplaceholder.typicode.com/users');

  if (!res.ok) {
    throw new Error('데이터를 가져오는데 실패했습니다.');
  }
  return res.json();
};
