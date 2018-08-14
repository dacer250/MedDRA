package com.gzpykj.chps.meddra.parser;

import com.gzpykj.chps.meddra.entity.SocTerm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件中的数据字段排列顺序与每个表的 MedDRA 模式（第三部分）相同。
 * 数据间以“‘$’”分隔。第一个字段的开头没有“‘$’“，但最后一个字段的末尾有“‘$’“。
 *
 *  对应的文件，soc.asc
 *
 *  10005329$血液及淋巴系统疾病$Blood$$$$$$$$
 *  与字段的对应关系：
 * soc_code	bigint	Unchecked
 * soc_name	varchar(100)	Unchecked
 * soc_abbrev	varchar(5)	Unchecked
 * soc_whoart_code	varchar(7)	Checked
 * soc_harts_code	bigint	Checked
 * soc_costart_sym	varchar(21)	Checked
 * soc_icd9_code	varchar(8)	Checked
 * soc_icd9cm_code	varchar(8)	Checked
 * soc_icd10_code	varchar(8)	Checked
 * soc_jart_code	varchar(6)	Checked
 *
 */

public class SocTermParser {
    private String [] fieldIndex = {
            "socCode",
            "socName",
            "socAbbrev",
            "socWhoartCode",
            "socHartsCode",
            "socCostartSym",
            "socIcd9Code",
            "socIcd9cmCode",
            "socIcd10Code",
            "socJartCode"
    };

    protected SocTerm tokenHandle(String[] token) {
        for(int i = 0 ; i < token.length ; i ++) {

        }
        return null;
    }

    public static  void main(String [] args) {
        SocTermParser parser = new SocTermParser();
        //parser.parserField();

    }
}
