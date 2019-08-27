package cn.lightfish.sql.persistent;

import cn.lightfish.sql.executor.logicExecutor.Executor;
import cn.lightfish.sql.schema.SimpleColumnDefinition;

public class QueryPersistent implements Executor {

  @Override
  public SimpleColumnDefinition[] columnDefList() {
    return new SimpleColumnDefinition[0];
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public Object[] next() {
    return new Object[0];
  }
}