package lotto.repository.paper;

import java.util.List;
import lotto.Lotto;

public interface PaperRepository {
    void savePaper(Lotto lotto);

    List<Lotto> getAllPaper();
}