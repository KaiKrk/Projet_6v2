package com.projet6.contrat;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CommentaireDao {
    /*
Show all comments from a topo
 */
    List<String> ShowComments(int idTopo);
    /*
    To add a comment
    @return Comment
     */
    String addComments (int idTopo);
    /*
    delete selected comment
     */
    String deleteComments (int idTopo, int idComment);

}
