/**
 * 
 */
package TestDataBank;

/**
 * @author User Pc
 *
 */
public final class TestDataValue {
    
    static TestDataUtils<String, Integer> testData = new TestDataManager();
    
    public static final Object GETNA= testData.getdataFromRowColoumNumber(0, 1, 8);
    
    public static final Object CHARITY_NAME= testData.getdataFromRowColoumNumber(0, 1, 2);
    
}
