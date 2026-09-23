import Link from 'next/link';

export default function Home() {
  return (
    <main>
      <h1>홈 페이지입니다.</h1>
      <nav>
        <Link href="/about">소개보기</Link>
        <br />
        <Link href="/menu">메뉴보기</Link>
      </nav>
    </main>
  );
}
