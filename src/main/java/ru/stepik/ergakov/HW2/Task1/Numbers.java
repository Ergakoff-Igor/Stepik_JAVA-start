package ru.stepik.ergakov.HW2.Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Numbers <T extends Number>{
    private T dec;
    private String bin;
    private String oct;
    private String hex;
}
