package week1.TestingArtifacts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
 *
 */
public class ListTransformation {

	public static List<String> toLowerCase(List<String> list) {

		if (list == null) {
			return list;
		}
		// List<String> lowerCaseList = null;
		List<String> lowerCaseList = new ArrayList<String>();

		for (int i = 0; list != null && i < list.size(); ++i) {

			// lowerCaseList = new ArrayList<String>();

			lowerCaseList.add(list.get(i).toLowerCase());
		}

		return lowerCaseList;
	}
}
