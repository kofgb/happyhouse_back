package com.ssafy.vue.service;

import com.ssafy.vue.dto.MemberDto;

public interface MemberService {

	public MemberDto login(MemberDto memberDto) throws Exception;
	public MemberDto userInfo(String userid) throws Exception;
	public boolean registerMember(MemberDto memberDto);
	public boolean modifyMember(MemberDto memberdto);
	public boolean deleteMember(String userid);
	public int checkId(String userid);
	
}
