package dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import status.TrangThaiDatTruoc;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietPhieuDatTruocDto {

        private long maDatTruoc;
        private long maTieuDe;
        private  String trangThaiDatTruoc;
        private String maDia;

        public ChiTietPhieuDatTruocDto(long maDatTruoc, long maTieuDe, TrangThaiDatTruoc trangThaiDatTruoc,String maDia) {
                this.maDatTruoc = maDatTruoc;
                this.maTieuDe = maTieuDe;
                this.trangThaiDatTruoc = trangThaiDatTruoc.toString();
                this.maDia=maDia;
        }
}
