package com.nhom6.server_nhom6.common.dto.Page;

import com.nhom6.server_nhom6.common.dto.KhachHangDto;
import com.nhom6.server_nhom6.common.page.PaginationMeta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHangPage {

        private PaginationMeta paginationMeta;
        private List<KhachHangDto> khachHangDtos;
}
