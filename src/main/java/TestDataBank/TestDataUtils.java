package TestDataBank;

import java.util.List;

abstract interface TestDataUtils<T, N> {
    
    
    /***
     * @author Shaikh Rameez Ahmed
     * @param sheetIndex (can be integer or any number format)
     * @param RwoIndex (can be integer or any number format)
     * @param ColumINdex(can be integer or any number format)
     * @return Can be of any type i.e Cell or String
     */
    T getdataFromRowColoumNumber(N sheetIndex,N RwoIndex ,N ColumINdex);
    
    
    /***
     * Function to get all the values of row present in the sheet
     */
    
    List<T> getAllRowValue();
}