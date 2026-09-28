'use client';

import { useEffect, useState } from 'react';
import { postAPI } from '../api/postAPI';

export default function CRUDTest() {
  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  const loadPosts = async () => {
    try {
      setLoading(true);
      setError(null);

      const data = await postAPI.getPosts();
      setPosts(data);
    } catch (error) {
      setError(error.message);
    } finally {
      setLoading(false);
    }
  };

  const handleAdd = async () => {
    try {
      setError(null);
      await postAPI.createPost({
        title: '새로운 게시글' + Date.now(),
        author: '오현규',
      });
      await loadPosts();
    } catch (error) {
      setError(error.message);
    }
  };

  const handleUpdate = async (id) => {
    try {
      setError(null);

      await postAPI.updatePost(id, '수정된 게시글 제목');
      await loadPosts();
    } catch (error) {
      setError(error.message);
    }
  };

  const handleDelete = async (id) => {
    const shouldDelete = window.confirm('정말 삭제할까요?');

    if (!shouldDelete) return;

    try {
      setError(null);
      await postAPI.deletePost(id);
      await loadPosts();
    } catch (error) {
      setError(error.message);
    }
  };

  useEffect(() => {
    loadPosts();
  }, []);

  if (loading) return <div>...로딩 중...</div>;
  if (error) return <p>오류: {error}</p>;

  return (
    <>
      <h1>게시글 관리</h1>
      {posts.map((post) => {
        return (
          <div key={post.id}>
            <h3>게시글 제목: {post.title}</h3>
            <h3>작성자: {post.author}</h3>
            <button onClick={() => handleUpdate(post.id)}>게시글 수정</button>
            <button onClick={() => handleDelete(post.id)}>게시글 삭제</button>
          </div>
        );
      })}
      <button onClick={handleAdd}>새 글 등록</button>
    </>
  );
}
