package BAI_KIEM_TRA;

public class _1672RichestCustomerWealth {
    public int maximumWealth(int[][] a){
        int soKhachHang = a.length;
        int soNganHang = a[0].length;

        int max = 0 ;
        for (int i = 0; i < soKhachHang; i++) {
            int tinhTongHangI = 0 ;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongHangI += a[i][j];
            }
            if (tinhTongHangI > max){
                max = tinhTongHangI;
            }
        }
        return max;
    }
}
