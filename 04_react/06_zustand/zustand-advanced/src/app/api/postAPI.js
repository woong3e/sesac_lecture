const BASE_URL = 'http://localhost:9999/posts';

export const postAPI = {
  getPosts: async () => {
    const res = await fetch(BASE_URL);

    if (!res.ok) {
      throw new Error('게시글 목록을 가져오지 못했어요.');
    }

    return res.json();
  },

  createPost: async (newPost) => {
    const res = await fetch(BASE_URL, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(newPost), // stringify: JS 객체를 JSON 본문으로 보낼 때 사용한다.
    });

    if (!res.ok) {
      throw new Error('게시글 등록 실패');
    }
    return res.json();
  },

  updatePost: async (id, updatedTitle) => {
    const res = await fetch(`${BASE_URL}/${id}`, {
      method: 'PATCH',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ title: updatedTitle }),
    });

    if (!res.ok) {
      throw new Error('게시글 수정 실패');
    }
    return res.json();
  },

  deletePost: async (id) => {
    const res = await fetch(`${BASE_URL}/${id}`, {
      method: 'DELETE',
    });

    if (!res.ok) {
      throw new Error('게시글 수정 실패');
    }
    return true; // 성공 여부만 반환한다.
  },
};
