import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lsj on 17/7/29.
 */



public class test {


//    @SsoAuth
//    @RequestMapping("/add_project")
//    public ResponseBean<Boolean> addProjectAndItem() {
//        List<String> dimensions = new ArrayList<>();
//        dimensions.add("{"name":"A","level":{"1":"zllA","2":"zll2","3":"zll3","4":"zll4","5":"zll5"}}");
//        dimensions.add("{\"level\":{\"1\":\"zllE\",\"2\":\"zll2\",\"3\":\"zll3\",\"4\":\"zll4\",\"5\":\"zll5\"},\"name\":\"E\"}");
//        dimensions.add("{\"name\":\"B\",\"level\":{\"1\":\"zllB\",\"2\":\"zll2\",\"3\":\"zll3\",\"4\":\"zll4\",\"5\":\"zll5\"}}");
//        dimensions.add("{\"name\":\"C\",\"level\":{\"1\":\"zllC\",\"2\":\"zll2\",\"3\":\"zll3\",\"4\":\"zll4\",\"5\":\"zll5\"}}");
//        dimensions.add("{\"name\":\"D\",\"level\":{\"1\":\"zllD\",\"2\":\"zll2\",\"3\":\"zll3\",\"4\":\"zll4\",\"5\":\"zll5\"}}");
//
//        List<ItemBaseBean> items = new ArrayList<>();
//        for (int i=0;i<1;i++){
//            ItemBaseBean itemBaseBean = new ItemBaseBean();
//            itemBaseBean.setItemId(1111111111);
//            itemBaseBean.setItemName("测试商品001");
//            itemBaseBean.setItemUrl("http://wd.geilicdn.com/bj-pc-1103313886-1502699598113-110125752_41_41.jpg?w=41&h=41");
//        }
//        Boolean result = evaluatorPlatService.addProjectAndItem(0, "zll", "zll", "zll", 3, items, dimensions);
//        return new ResponseBean<>(result, "result");
//    }


//    private Map<String, String> getNameMap(List<String> list, Pattern pattern){
//        Map<String, String> map = new HashMap<>();
//        for (String item: list){
//            Matcher matcher = pattern.matcher(item);
//            if (matcher.find()){
//                String dimensionName = matcher.group();
//                map.put(matcher.group().substring(2,dimensionName.length()-1), item);
//            }
//        }
//    }

//    private List<String> getDimensionList(String reportData, Pattern namePat){
//        Pattern pattern = Pattern.compile("\\{.*?}");
//        Matcher m = pattern.matcher(reportData);
//
//        List<String> reportDataList = new ArrayList<>();
//        while (m.find()){
//            String report = m.group();
//            System.out.println("res: " + report);
//            reportDataList.add(report.substring(1, report.length()-1));
//
//            Matcher m2 = namePat.matcher(report);
//            if (m2.find()){
//                String x = m2.group();
//                System.out.println("name: "+ x.substring(13, x.length()-1));
//            }
//        }
//        return reportDataList;
//    }
}
