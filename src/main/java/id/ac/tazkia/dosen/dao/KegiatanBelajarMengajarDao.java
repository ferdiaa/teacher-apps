package id.ac.tazkia.dosen.dao;

import id.ac.tazkia.dosen.entity.Dosen;
import id.ac.tazkia.dosen.entity.KegiatanBelajarMengajar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KegiatanBelajarMengajarDao extends PagingAndSortingRepository<KegiatanBelajarMengajar, String> {
    Page<KegiatanBelajarMengajar> findByDosen(Dosen dosen, Pageable pageable);
}
