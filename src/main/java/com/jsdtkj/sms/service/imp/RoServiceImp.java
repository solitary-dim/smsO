package com.jsdtkj.sms.service.imp;

import java.util.List;

import com.jsdtkj.sms.dao.RoDao;
import com.jsdtkj.sms.dao.imp.RoDaoImp;
import com.jsdtkj.sms.entity.Ro;
import com.jsdtkj.sms.service.RoService;

public class RoServiceImp implements RoService {

    RoDao ro = new RoDaoImp();

    public Ro checkall(String rusername, String rpwd) {
        return ro.checkall(rusername, rpwd);
    }

    public boolean checkname(String rusername) {
        return ro.checkname(rusername);
    }

    public boolean checkpwd(String rpwd) {
        return ro.checkpwd(rpwd);
    }

    public Ro selectRoById(int rid) {
        return ro.SelectRoById(rid);
    }

    public List<Ro> showRo() {
        return ro.showRo();
    }

    public boolean updateRoById(int rid, String rusername, String rmobileno,
                                String remail) {
        return ro.UpdateRoById(rid, rusername, rmobileno, remail);
    }

    public boolean updateRoById(int rid, String rpwd) {
        return ro.UpdateRoById(rid, rpwd);
    }

    public boolean addRo(String rusername, String rpwd, String rname,
                         String rsex, int rage, String remail, String rmobileno, String rno) {
        return ro.addRo(rusername, rpwd, rname, rsex, rage, remail, rmobileno, rno);
    }

    public boolean deleteRoById(int rid) {
        return ro.deleteRoById(rid);
    }

    public boolean UpdateRoById(int rid, String rusername, String rname,
                                String rsex, int rage, String remail, String rmobileno,
                                String rcompany, String rno, String rteam) {
        return ro.UpdateRoById(rid, rusername, rname, rsex, rage, remail, rmobileno, rcompany, rno, rteam);

    }

    public List<Ro> selectRoByTeam(String rteam) {
        return ro.selectRoByTeam(rteam);
    }

    public boolean updatePer(String rteam, int rperformance) {
        // TODO Auto-generated method stub
        return ro.updatePer(rteam, rperformance);
    }


}
