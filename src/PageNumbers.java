import java.util.ArrayList;
import java.util.List;

public class PageNumbers {



    public static void main(String[] args) {
        System.out.println( getPages(5,20));
    }

    public static List<Integer> getPages(int currentPage, int totalPagesOfResults){
        int firstPage = 1;
        int pageStart = firstPage;
        List<Integer> returnList = new ArrayList<>();

        for(int i=1; i<=10;i++){
            returnList.add(i);
        }

        return returnList;
    }

}
