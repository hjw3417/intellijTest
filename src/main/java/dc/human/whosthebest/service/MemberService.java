package dc.human.whosthebest.service;

import dc.human.whosthebest.vo.MemberVO;

import java.util.List;

public interface MemberService {
	 public List listMembers() throws Exception;
	 public int addMember(MemberVO memberVO) throws Exception;
	 public int removeMember(String id) throws Exception;
	 public MemberVO login(MemberVO memberVO) throws Exception;
}
