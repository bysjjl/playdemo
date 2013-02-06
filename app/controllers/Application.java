package controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import models.Employee;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;




import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.SqlUpdate;

import play.*;


import play.api.libs.concurrent.Promise;
import play.libs.Json;
import play.mvc.*;
import play.mvc.Http.RequestBody;
import scala.annotation.target.param;

import views.html.*;

public class Application extends Controller {
	
	
	
	private static Promise<Double> computePIAsynchronously(){
		
		return null;
	}

	public static Result index() {

		return ok(index.render());

	}

	@With({MixTwo.class})
	public static Result login() {
		System.out.println("Login...");
		
		
//		Promise<Double> promiseOfPIValue = computePIAsynchronously();
//		Promise<Result> promiseOfResult = promiseOfPIValue.map(
//		  new Function<Double,Result>() {
//		    public Result apply(Double pi) {
//		      return ok("PI value computed: " + pi);
//		    } 
//		  }
//		);
		
		
		return ok(login.render());

	}

	public static Result grid() {

		return ok(grid.render());

	}

	public static Result table() {
		List<SqlRow> rs = Ebean.createSqlQuery("select * from CP_EMPLOYEE")
				.setMaxRows(30).findList();
		return ok(table.render(rs));

	}

	public static Result css() {
		return ok(css.render());

	}

	public static Result script() {
		return ok(script.render());

	}

	public static Result menu() {
		return ok(menu.render());

	}

	public static Result top() {
		return ok(top.render());

	}

	public static Result foot() {
		return ok(foot.render());

	}

	public static Result qlist() {

		return ok(qlist.render());

	}

	public static Result mform() {

		return ok(mform.render());

	}

	public static Result chart() {

		return ok(chart.render());

	}

	public static Result typography() {

		return ok(typography.render());

	}

	public static Result gallery() {

		return ok(gallery.render());

	}

	public static Result calendar() {

		return ok(calendar.render());

	}

	public static Result file() {

		return ok(file.render());

	}

	public static Result tour() {

		return ok(tour.render());

	}

	public static Result icon() {

		return ok(icon.render());

	}

	public static Result error() {

		return ok(error.render());

	}

	public static Result micon() {

		return ok("");
	}

	public static Result qlistRs(String page, String rows, String sidx,
			String sord) {

		int maxrows = Integer.valueOf(rows);
		int intpage = Integer.valueOf(page);

		int rl = (intpage - 1) * maxrows + maxrows;
		int rg = (intpage - 1) * maxrows;

		int first = (intpage - 1) * 10;

		int total = Ebean
				.createSqlQuery("select count(*) as count from CP_EMPLOYEETEST")
				.findUnique().getInteger("count");

		//sql
		// List<SqlRow> rs =
		// Ebean.createSqlQuery("select * from CP_EMPLOYEE").setFirstRow(first)
		// .setMaxRows(maxrows).findList();

		// String sql =
		// "select * from (select page.*,rownum rn from  CP_EMPLOYEETEST page  where rownum <= "
		// + rl + ")  where rn > " + rg;
		// if (sidx != null) {
		// sql = sql + " order by " + sidx + " " + sord;
		//
		// }

		// List<SqlRow> rs = Ebean.createSqlQuery(sql).findList();

		//ebean
		List<Employee> ers = Employee.find.setFirstRow(first)
				.setMaxRows(maxrows).order(sidx + " " + sord).findList();
		System.out.println("---------------" + ers.size());

		//sql
		// ObjectNode objectNode = Json.newObject();
		// objectNode.put("page", page);
		// objectNode.put("total", total % maxrows > 0 ? total / maxrows + 1
		// : total / maxrows);
		// objectNode.put("records", String.valueOf(total));
		// ArrayNode anode = objectNode.putArray("rows");
		//
		// for (SqlRow row : rs) {
		//
		// ObjectNode robjectNode = anode.addObject();
		//
		// robjectNode.put("id", row.getString("cp_employee_id"));
		// ArrayNode acellnode = robjectNode.putArray("cell");
		// acellnode.add(row.getString(""));
		// acellnode.add(row.getString("cp_employee_id"));
		// acellnode.add(row.getString("name"));
		// acellnode.add(row.getString("user_code"));
		// acellnode.add(row.getString("sex"));
		// acellnode.add(row.getString("created_datetime"));
		//
		// }

		ObjectNode objectNode = Json.newObject();
		objectNode.put("page", page);
		objectNode.put("total", total % maxrows > 0 ? total / maxrows + 1
				: total / maxrows);
		objectNode.put("records", String.valueOf(total));
		ArrayNode anode = objectNode.putArray("rows");

		for (Employee row : ers) {

			ObjectNode robjectNode = anode.addObject();

			robjectNode.put("id", row.cp_employee_id);
			ArrayNode acellnode = robjectNode.putArray("cell");
			acellnode.add("");
			acellnode.add(row.cp_employee_id);
			acellnode.add(row.name);
			acellnode.add(row.user_code);
			acellnode.add(row.sex);
			acellnode.add(row.created_datetime.toString());

		}

		response().setContentType("text/json;charset=UTF-8");

		return ok(objectNode.toString());

	}

	
	public static Result qupdate() {
		
		
		// System.out.println(form().bindFromRequest().data());
		Map<String, String> formmap = form().bindFromRequest().data();

		String oper = formmap.get("data[oper]").toString();
		String id = formmap.get("data[id]");
		String user_code = formmap.get("data[user_code]");
		String name = formmap.get("data[name]");
		String sex = formmap.get("data[sex]");

		if (oper.equals("edit")) {
			// sql
			// SqlUpdate su = Ebean
			// .createSqlUpdate("update CP_EMPLOYEETEST set name=:name ,user_code=:user_code,sex=:sex where cp_employee_id =:id");
			// su.setParameter("name", name);
			// su.setParameter("user_code", user_code);
			// su.setParameter("sex", sex);
			// su.execute();

			// ebean
			Employee em = Ebean.find(Employee.class, new Long(id));
			em.name = name;
			em.user_code = user_code;
			em.sex = sex;
			Ebean.update(em);

		} else if (oper.equals("add")) {

			// sql
			// SqlUpdate su = Ebean
			// .createSqlUpdate("insert into  CP_EMPLOYEETEST  values (seq_pk_id.NEXTVAL,:name ,sysdate,:sex,:user_code)");
			// su.setParameter("name", name);
			// su.setParameter("user_code", user_code);
			// su.setParameter("sex", sex);
			//
			// su.execute();

			// ebean
			Employee em = new Employee();
			em.name = name;
			em.user_code = user_code;
			em.sex = sex;
			em.created_datetime = new Date();
			Ebean.save(em);

		} else if (oper.equals("del")) {

			// sql
			// SqlUpdate su = Ebean
			// .createSqlUpdate("delete from  CP_EMPLOYEETEST  where cp_employee_id=:id");
			// su.setParameter("id", id);
			//
			// su.execute();

			// ebean
			Employee.delete(new Long(id));

		}

		return ok();

	}

}