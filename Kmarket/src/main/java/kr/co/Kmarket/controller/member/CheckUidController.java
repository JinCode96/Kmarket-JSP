package kr.co.Kmarket.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.Kmarket.service.member.MemberService;

@WebServlet("/member/checkUid.do")
public class CheckUidController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private MemberService service = MemberService.INSTANCE;

	@Override
	public void init() throws ServletException {}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uid = req.getParameter("uid");
		
		int result = service.selectCountUid(uid);
		
		// JSON 출력
		service.sendResult(result, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
	
}
