### 统计后台


```xml
<resultMap id="BaseResultMap" type="com.example.statisticback.entity.User">
    <id column="id" jdbcType="INTEGER" property="id" />
    <result column="username" jdbcType="VARCHAR" property="username" />
    <result column="password" jdbcType="VARCHAR" property="password" />
    <result column="department_id" jdbcType="INTEGER" property="departmentId" />
  </resultMap>
```