package com.ssafy.vue.mapper;

import java.sql.SQLException;

import com.ssafy.vue.dto.MemberDto;


public interface MemberMapper {

	public MemberDto login(MemberDto memberDto) throws SQLException;
	public MemberDto userInfo(String userid) throws SQLException;
	public boolean registerMember(MemberDto memberDto);
	public boolean modifyMember(MemberDto memberDto);
	public boolean deleteMember(String userid);
	public Integer checkId(String userid);
	
}