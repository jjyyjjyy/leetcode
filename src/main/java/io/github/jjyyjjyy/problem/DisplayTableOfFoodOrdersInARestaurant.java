package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <a href="https://leetcode-cn.com/problems/display-table-of-food-orders-in-a-restaurant/">点菜展示表</a>
 *
 * <p>给你一个数组 <code>orders</code>，表示客户在餐厅中完成的订单，确切地说， <code>orders[i]=[customerName<sub>i</sub>,tableNumber<sub>i</sub>,foodItem<sub>i</sub>]</code> ，其中 <code>customerName<sub>i</sub></code> 是客户的姓名，<code>tableNumber<sub>i</sub></code> 是客户所在餐桌的桌号，而 <code>foodItem<sub>i</sub></code> 是客户点的餐品名称。</p>
 *
 * <p>请你返回该餐厅的 <strong>点菜展示表</strong><em> 。</em>在这张表中，表中第一行为标题，其第一列为餐桌桌号 &ldquo;Table&rdquo; ，后面每一列都是按字母顺序排列的餐品名称。接下来每一行中的项则表示每张餐桌订购的相应餐品数量，第一列应当填对应的桌号，后面依次填写下单的餐品数量。</p>
 *
 * <p>注意：客户姓名不是点菜展示表的一部分。此外，表中的数据行应该按餐桌桌号升序排列。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>orders = [[&quot;David&quot;,&quot;3&quot;,&quot;Ceviche&quot;],[&quot;Corina&quot;,&quot;10&quot;,&quot;Beef Burrito&quot;],[&quot;David&quot;,&quot;3&quot;,&quot;Fried Chicken&quot;],[&quot;Carla&quot;,&quot;5&quot;,&quot;Water&quot;],[&quot;Carla&quot;,&quot;5&quot;,&quot;Ceviche&quot;],[&quot;Rous&quot;,&quot;3&quot;,&quot;Ceviche&quot;]]
 * <strong>输出：</strong>[[&quot;Table&quot;,&quot;Beef Burrito&quot;,&quot;Ceviche&quot;,&quot;Fried Chicken&quot;,&quot;Water&quot;],[&quot;3&quot;,&quot;0&quot;,&quot;2&quot;,&quot;1&quot;,&quot;0&quot;],[&quot;5&quot;,&quot;0&quot;,&quot;1&quot;,&quot;0&quot;,&quot;1&quot;],[&quot;10&quot;,&quot;1&quot;,&quot;0&quot;,&quot;0&quot;,&quot;0&quot;]]
 * <strong>解释：
 * </strong>点菜展示表如下所示：
 * <strong>Table,Beef Burrito,Ceviche,Fried Chicken,Water</strong>
 * 3    ,0           ,2      ,1            ,0
 * 5    ,0           ,1      ,0            ,1
 * 10   ,1           ,0      ,0            ,0
 * 对于餐桌 3：David 点了 &quot;Ceviche&quot; 和 &quot;Fried Chicken&quot;，而 Rous 点了 &quot;Ceviche&quot;
 * 而餐桌 5：Carla 点了 &quot;Water&quot; 和 &quot;Ceviche&quot;
 * 餐桌 10：Corina 点了 &quot;Beef Burrito&quot;
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>orders = [[&quot;James&quot;,&quot;12&quot;,&quot;Fried Chicken&quot;],[&quot;Ratesh&quot;,&quot;12&quot;,&quot;Fried Chicken&quot;],[&quot;Amadeus&quot;,&quot;12&quot;,&quot;Fried Chicken&quot;],[&quot;Adam&quot;,&quot;1&quot;,&quot;Canadian Waffles&quot;],[&quot;Brianna&quot;,&quot;1&quot;,&quot;Canadian Waffles&quot;]]
 * <strong>输出：</strong>[[&quot;Table&quot;,&quot;Canadian Waffles&quot;,&quot;Fried Chicken&quot;],[&quot;1&quot;,&quot;2&quot;,&quot;0&quot;],[&quot;12&quot;,&quot;0&quot;,&quot;3&quot;]]
 * <strong>解释：</strong>
 * 对于餐桌 1：Adam 和 Brianna 都点了 &quot;Canadian Waffles&quot;
 * 而餐桌 12：James, Ratesh 和 Amadeus 都点了 &quot;Fried Chicken&quot;
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>orders = [[&quot;Laura&quot;,&quot;2&quot;,&quot;Bean Burrito&quot;],[&quot;Jhon&quot;,&quot;2&quot;,&quot;Beef Burrito&quot;],[&quot;Melissa&quot;,&quot;2&quot;,&quot;Soda&quot;]]
 * <strong>输出：</strong>[[&quot;Table&quot;,&quot;Bean Burrito&quot;,&quot;Beef Burrito&quot;,&quot;Soda&quot;],[&quot;2&quot;,&quot;1&quot;,&quot;1&quot;,&quot;1&quot;]]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;=&nbsp;orders.length &lt;= 5 * 10^4</code></li>
 * 	<li><code>orders[i].length == 3</code></li>
 * 	<li><code>1 &lt;= customerName<sub>i</sub>.length, foodItem<sub>i</sub>.length &lt;= 20</code></li>
 * 	<li><code>customerName<sub>i</sub></code> 和 <code>foodItem<sub>i</sub></code> 由大小写英文字母及空格字符 <code>&#39; &#39;</code> 组成。</li>
 * 	<li><code>tableNumber<sub>i</sub></code> 是 <code>1</code> 到 <code>500</code> 范围内的整数。</li>
 * </ul>
 */
@Problem(
    id = 1533,
    name = "display-table-of-food-orders-in-a-restaurant",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.HASH_TABLE, Tag.STRING, Tag.ORDERED_SET, Tag.SORTING}
)
public class DisplayTableOfFoodOrdersInARestaurant {

    /**
     * 1. 按菜品和桌号统计个数.
     * 2. 依次遍历菜品和桌号, 输出个数.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> customerCount = new TreeMap<>();
        Map<String, Map<Integer, Integer>> foodCount = new TreeMap<>();
        for (List<String> order : orders) {
            int customer = Integer.parseInt(order.get(1));
            String food = order.get(2);
            Map<String, Integer> c = customerCount.getOrDefault(customer, new TreeMap<>());
            c.put(food, c.getOrDefault(food, 0) + 1);
            customerCount.put(customer, c);

            Map<Integer, Integer> f = foodCount.getOrDefault(food, new TreeMap<>());
            f.put(customer, f.getOrDefault(customer, 0) + 1);
            foodCount.put(food, f);
        }

        List<List<String>> result = new ArrayList<>();
        List<String> title = new ArrayList<>();
        title.add("Table");
        title.addAll(foodCount.keySet());
        result.add(title);

        customerCount.forEach((customer, f) -> {
            List<String> currentLine = new ArrayList<>();
            currentLine.add(String.valueOf(customer));
            foodCount.keySet().forEach(food -> currentLine.add(String.valueOf(f.getOrDefault(food, 0))));
            result.add(currentLine);
        });
        return result;
    }
}
