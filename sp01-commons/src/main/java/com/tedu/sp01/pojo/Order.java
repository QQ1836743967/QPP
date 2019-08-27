package com.tedu.sp01.pojo;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id;//订单id
	private User user;//用户订单
	private List<Item> items;//订单列表
}