'use client';

import Parent from './components/Parent';
import { useStore } from '@/store/useStore';

export default function Home() {
  const { count } = useStore();

  return (
    <>
      <h1>Props Drilling</h1>
      <h2>page에서 보는 count: {count}</h2>
      <Parent />
    </>
  );
}
