import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SwapTest {

    @Test
    public void swapTest() throws Exception {
        //given
        int a = 10;
        int b = 20;

        //when
        swap(a,b);
        //then
        /*결과가 바뀌지 않음*/
        assertEquals(a,10);
        assertEquals(b,20);
    }

    /*값 복사가 일어남 */
    // 원본에 영향이 없음
    private void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp ;
    }
}
