'use client';

import { useQuery } from '@tanstack/react-query';
import { fetchUsers } from '../api/userAPI';

export default function QueryPage() {
  const { data, isLoading, isError, error, refetch, isFetching } = useQuery({
    queryKey: ['users'], // queryKey로 저장해놓는데 이건 사용자 전체목록, queryKey:['users',1] -> 1번 사용자
    queryFn: fetchUsers, // 함수를 전달.
  });
  //   console.log(query);

  if (isLoading) {
    return <h1>...데이터를 불러오는 중...</h1>;
  }
  if (isError) {
    return (
      <>
        <h1>사용자 정보를 가져오지 못함</h1>
        <p>{error.message}</p>
        <button onClick={() => refetch()}>다시 시도</button>
      </>
    );
  }

  return (
    <>
      <h1>사용자 목록</h1>
      {isFetching && <p>최신 데이터 확인중...</p>}
      {data.map((user) => {
        return (
          <div key={user.id}>
            <strong>이름: {user.name}</strong>
            <p>이메일: {user.email}</p>
          </div>
        );
      })}
      <button onClick={() => refetch()}>refetch</button>
    </>
  );
}
