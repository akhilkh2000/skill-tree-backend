package utils;

import java.util.HashMap;
import java.util.Map;

public class RestAPIHelper {
   public static Map<String, String> getSuperUserCookie(){

       Map<String, String> cookie= new HashMap<>();
       cookie.put("rds-session-v2", "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiIyZlFFbVgyRW85a3lhM3NHdlJMMiIsInJvbGUiOiJzdXBlcl91c2VyIiwiaWF0IjoxNzA4NzgyODczLCJleHAiOjE3MTEzNzQ4NzN9.pOpm_pJk9hKqZ_JDtyFietItb4P1Wr2VvA53Qo0_nx1KHjjd24MPnQg-NOUaFZ2X_GWe8zOMklLgf3vX271tXTW98GQOiQdyqJZENtwJuxhiwT-3eLhPW8Kg2flfa3_mew0_s89e_hy3i1I4GH-YsCUaQ_SxrtlmZudYlExDhj-RuPVmz5djd7ra2mz6rsQhUMY047YKm0Szi3UMK1iWYJTHehwdtG0Y3PlR2hHyBrUFPpsxdFALcKwkV7rdcJgpDwZd6AnWCFiut940Mbr9W6tq7VMQLMC9Hjlnd5_2dVdz7NEUQ7BHTTFyStt6HdS_0-IgyZZR64AUXyMp-JAOwpLJr4A3psCc1pwn0UPy_2weRfXBm7k0xJO3cmV5x19k1jHxdW6LxaJthbsx9r_dY6B4IrsIJxBS_CefPrDv8JhW1EEkkYGWMpyzvMjqf5bpexJ1KLsKsqKIh-nEfE-CG-Yj5Cm5xFhdYE5iBdyehuClnaiBkUO4DU6GrcmgYkevsJs6uhfg_iVqZKt3xisO_0DNr1chCLCGBG_M25Xj5kT_ljzqLtaxi-OTIMQXK5lhx2e_sTrxC1T3gZ2em-WRSkC960tYfP2xnVS_DbNmk5yk3ZQEpOGgKfl7MhbJVYaXMUqR-lWLU1JoFvAsBvkh65ucztmPbXTNK6VcudWWGYI");
        return cookie;
   }

    public static Map<String, String> getUserCookie(){

        Map<String, String> cookie= new HashMap<>();
        cookie.put("rds-session-v2","eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiIyZlFFbVgyRW85a3lhM3NHdlJMMiIsInJvbGUiOiJtZW1iZXIiLCJpYXQiOjE3MDkzOTM1ODQsImV4cCI6MTcxMTk4NTU4NH0.Vn_s9kp3TZl4CUYh4U4A3fzhIeoObssWyntQrt9BajBRGPm9afZ72NPkq90cgySSxSICLZiXpJXv6RjmD84sOhXYnvAgLMNtoV0zYDJxrPDwOX0RHYU5xLFjQgDbwxy94BKa-FtU2ZznTtEb6jpdwTrTOvVa8oTwEVTcIID--mQzUyC6AYy8u6vo6BcruC3n7I-GNZtyNufxXuTAycXG5Ln7SitGonl7iU8XNovARavxPH-m_8lYNj5zwNNQwi0EdWvaMTczUb2X-CaaMeloGByZs4KPPHhAhDs-0PTRAHmYvhLrF4RpOnVVvEcNmQdAjJeC56ZIt5LfHtPLOGHxvPQstw_Lv4HgXhAPi3E8R0qmDj2DtS6o5ukMMmNxwUbH2Y0amt-q_yWPUU0spUUPwKVe18e1BPG3FAlDxh2sup-S2fvVvdIWnw2SnHQ7p7Mv2IhGRPsySEKkXrYYWU-IJdJnByHYEHAOaYFdF4N4Ssa-t--7wuYytlIsSwPpq7s0qHbptvsb-Imc7WXT8fl9_NY-SRRPJuoj7w1yW0N51nyQt_f4DtdlcBCRWca_A1OPi9pR_T4Q5LPn4VD7-2wgjaIBA4FYA7mxEGK3Gu9KCtRPxzZW-WmQ7HqPQIJLaq8RALi8Tljhp9srkiRE14BWmZ1fCzGnYCnTDnJLILuPHzc" );
        return cookie;
    }
}
