package com.example.demo.member;

public interface MemberRepository {
    //회원저장
    void save(Member member);
    // 회원의ID로 회원검색
    Member findById(Long memberId);
}
