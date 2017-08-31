
import jdk.nashorn.internal.parser.JSONParser;

import javax.swing.text.html.HTMLDocument;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public void test(Class<?> clazz) {
        try {
            Method method = clazz.getMethod("fun", String.class);
            annotation a = method.getAnnotation(annotation.class);
            method.invoke(clazz.newInstance(), "zll");
            System.out.println(a.name());
            System.out.println(a.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkDimensions(List<String> dimensions){
        String patternStr = "\\{\"name\":.*?,\"level\":\\{\"1\":.*?,\"2\":.*?,\"3\":.*?,\"4\":.*?,\"5\":.*?}}";
        Pattern pattern = Pattern.compile(patternStr);
        for (String dim: dimensions){
            if (!pattern.matcher(dim.replaceAll(" +", "")).matches()){
                return false;
            }
        }
        return true;
    }

    public static boolean isNumericzidai(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+.?[0-9]+");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    private List<String> getDimensionList(String reportData, Pattern pattern){
//        Pattern pattern = Pattern.compile("\\{.*?}");
        Matcher m = pattern.matcher(reportData);

        List<String> reportDataList = new ArrayList<>();
        while (m.find()){
            String report = m.group();
            System.out.println("group_res: " + report);
            reportDataList.add(report.substring(1, report.length()-1));
        }
        return reportDataList;
    }

    public static void main(String[] args) {

        String s = null;
        System.out.println(s + "aa");


        user u = new user();
        List<user> ul = new ArrayList<>();
        ul.add(u);

        Map<String, user> map = new HashMap<>();
        map.put("1", u);
        Iterator<Map.Entry<String, user>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, user> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


//        map.put("2", "1");
//        map.put("3", "1");
//        map.put("4", "1");

        user t = map.get("1");
        t.setId(3);

        System.out.println("ul: "+ ul.get(0).getId());

        u.setName("zllzll");

        System.out.println("ul: "+ ul.get(0).getName());





        List<String> res = new ArrayList<>();
        for (HashMap.Entry entry: map.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(entry.getKey() + ": ");
            stringBuilder.append(entry.getValue());
            System.out.println(stringBuilder.toString());

            res.add(stringBuilder.toString());
        }

        System.out.println(res);

        Main main = new Main();

        String str = "[{\"starTitle\":\"1\",\"clickStar\":4,\"reason\":\"\"},{\"starTitle\":\"2\",\"clickStar\":4,\"reason\":\"\"},{\"starTitle\":\"3\",\"clickStar\":4,\"reason\":\"”\"},{\"starTitle\":\"4\",\"clickStar\":4,\"reason\":\"\"}]";

        String str2 = "[{\"name\":\"hello\",\"level\":{\"1\":\"zll1\",\"2\":\"zll2\",\"3\":\"zll3\",\"4\":\"zll4\",\"5\":\"zll5\"}}, {\"name\":\"world\",\"level\":{\"1\":\"zll1\",\"2\":\"zll2\",\"3\":\"zll3\",\"4\":\"zll4\",\"5\":\"zll5\"}}]";

//        res = main.getDimensionList(str2, Pattern.compile("\\{.*?\\{.*?}}"));
//        for(String x: res){
//            System.out.println("res: " + x);
//        }
//
//        res = main.getDimensionList(str, Pattern.compile("\\{.*?}"));
//        for(String x: res){
//            System.out.println("res: " + x);
//        }

        String str3 = "{\"level\":{\"1\":\"zllE\",\"2\":\"zll2\",\"3\":\"zll3\",\"4\":\"zll4\",\"5\":\"zll5\"}},\"name\":\"E\"";

    }

}

//param={"address":{ "buyer_address_id":25892,"buyer_name": "zll", "is_default": 0, "buyer_phone": "18121975656", "buyer_province": 1003, "buyer_city": 1352, "buyer_area": 6839, "buyer_town":140108, "buyer_street": "镇魂街3号", "buyer_phone_areacode": "86"}}&user_id=977372976

//[{"name":"hello";"level":{"1":"zll1";"2":"zll2";"3":"zll3";"4":"zll4";"5":"zll5"}}]