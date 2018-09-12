package action.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CheckAgeForm extends ActionForm{
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest req) {
		ActionErrors errors = new ActionErrors();
		String ageString = req.getParameter("age");
		//入力データの必須チェック
		if (ageString == null || "".equals(ageString)) {
			errors.add("age", new ActionMessage("error.age.required"));
			return errors;
		}
		if( !ageString.matches("[0-9]{1,8}")) {
			//入力データの型チェック
			errors.add("age", new ActionMessage("error.age.notint"));
			return errors;
		}
		int age = Integer.parseInt(ageString);
		//入力データの数値の範囲チェック
		if(age < 0 || age > 200) {
			errors.add("age", new ActionMessage("error.age.range"));
			return errors;
		}
		return errors;
	}

}
