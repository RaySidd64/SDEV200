package chapter_thirty_seven;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Module_7_assign_1 extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double totalAmount = Double.parseDouble(request.getParameter("loanAmount"));
        double annualInterestRate = Double.parseDouble(request.getParameter("annualInterestRate"));
        double years = Double.parseDouble(request.getParameter("numberOfYears"));

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = totalAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
        double total = monthlyPayment * 12 * years;


        out.println("Loan Amount: " + totalAmount + "<br>");
        out.println("Annual Interest Rate: " + annualInterestRate + "<br>");
        out.println("Number of Years: " + years + "<br>");
        out.println("Monthly Payment: " + monthlyPayment + "<br>");
        out.println("Total Payment: " + total);
    }
}