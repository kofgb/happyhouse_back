package com.ssafy.vue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dto.MemberDto;
import com.ssafy.vue.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public MemberDto login(MemberDto memberDto) throws Exception {
		if(memberDto.getUserid() == null || memberDto.getUserpwd() == null)
			return null;
		return memberMapper.login(memberDto);
	}

	@Override
	public MemberDto userInfo(String userid) throws Exception {
		return memberMapper.userInfo(userid);
	}

	@Override
	public boolean registerMember(MemberDto memberDto) {
		return memberMapper.registerMember(memberDto);
	}

	@Override
	public boolean modifyMember(MemberDto memberDto) {
		return memberMapper.modifyMember(memberDto);
	}

	@Override
	public boolean deleteMember(String userid) {
		return memberMapper.deleteMember(userid);
	}

	@Override
	public int checkId(String userid) {
		return memberMapper.checkId(userid);
	}



}
