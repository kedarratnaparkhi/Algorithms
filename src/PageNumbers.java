import java.util.ArrayList;
import java.util.List;

public class PageNumbers {



    public static void main(String[] args) {
        PageNumberModule pgModule = new PageNumberModule();
        System.out.println(pgModule.getPages(12,15));
    }
}

class PageNumberModule{

    private List<Integer> pages = new ArrayList<>();

    public List<Integer> getPages(int currentPage, int totalPagesOfResults) {
        int leftStartingPoint;
        int rightEndingPoint;

        // checks if the totalPagesOfResults is less than the currentPage provided, which is an invalid condition, and throws a runtime exception
        if(totalPagesOfResults < currentPage){
            throw new RuntimeException("Invalid inputs provided: Current Page number cannot be greater than the Total Number of Pages");
        }

        // sets the left and right endpoints to 1 and totalPagesOfResults, respectively, if the totalPagesOfResults is less than 10
        if(totalPagesOfResults <= 10){
            leftStartingPoint=1;
            rightEndingPoint = totalPagesOfResults;
        }else{
            // computes the left and right endpoints to make sure the current point acts as a median (5 elements to left, 4 elements to the right)
            leftStartingPoint = (currentPage-5)<1 ? 1: (currentPage-5);
            rightEndingPoint = (currentPage+4)>totalPagesOfResults ? totalPagesOfResults : (currentPage+4);
        }

        // Adds the page numbers to the list of numbers according to the computed left and right endpoints
        if(totalPagesOfResults <= 7){
            for(int i=1; i<=totalPagesOfResults; i++){
                pages.add(i);
            }
        }else{
            for(int i=leftStartingPoint; i<currentPage; i++){
                pages.add(i);
            }
            for(int i=currentPage; i<=rightEndingPoint; i++){
                pages.add(i);
            }
        }

        return pages;
    }
}
