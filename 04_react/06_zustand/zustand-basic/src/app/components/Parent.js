import Child from './Child';
import { useStore } from '@/store/useStore';

export default function Parent() {
  const { count, text } = useStore();

  return (
    <>
      <h1>parent count: {count}</h1>
      <h1>parent text: {text}</h1>
      <Child />
    </>
  );
}
