package week1.TestingArtifacts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
 *
 */
public class ListTransformations {

	public static List<String> toLowerCase(List<String> list) {

		List<String> lowerCaseList = null;

		for (int i = 0; list != null && i < list.size(); ++i) {

			lowerCaseList = new ArrayList<String>();

			lowerCaseList.add(list.get(i).toLowerCase());
		}

		return lowerCaseList;
	}
}
