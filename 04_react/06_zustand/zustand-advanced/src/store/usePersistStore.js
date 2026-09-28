import { create } from 'zustand';
import { persist } from 'zustand/middleware';

export const usePersistStore = create(
  persist(
    (set) => ({
      theme: 'light',
      toggleTheme: () =>
        set((state) => ({ theme: state.theme === 'light' ? 'dark' : 'light' })),
    }),
    { name: 'theme-storage' }, // localStorage 에 저장할 때 사용할 키값
  ),
);
