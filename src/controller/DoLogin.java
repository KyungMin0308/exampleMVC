package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customerId = request.getParameter("customerId"); //loginform.jsp의 input value와 같은 값이어야 한다.
		
		//service
		CustomerService service = (CustomerService) CustomerService.getInstance();
		Customer customer = service.findCustomer(customerId);
		List<Customer> customerList = service.getAllCustomer();
		
		//service 수행 후 결과를 저장, view로 결과를 넘겨주기 위해서
		request.setAttribute("customer", customer);
		request.setAttribute("customers", customerList);
		
		//view로 포워딩
		String page;
		
		if(customer == null)
			page = "/view/error.jsp";
		else
			page = "/view/success.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
	}

}
