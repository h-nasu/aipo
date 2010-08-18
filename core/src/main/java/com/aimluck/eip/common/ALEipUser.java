/*
 * Aipo is a groupware program developed by Aimluck,Inc.
 * Copyright (C) 2004-2008 Aimluck,Inc.
 * http://aipostyle.com/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.aimluck.eip.common;

import com.aimluck.commons.field.ALNumberField;
import com.aimluck.commons.field.ALStringField;

/**
 * ユーザー情報を表すクラスです。 <br />
 * 
 */
public class ALEipUser implements ALData {

  /** ID */
  private ALNumberField user_id;

  /** 名前 */
  private ALStringField name;

  /** 名前（アプリケーション） */
  private ALStringField alias_name;

  /**
   * 
   * @see com.aimluck.eip.common.ALData#initField()
   */
  public void initField() {
    user_id = new ALNumberField();
    name = new ALStringField();
    alias_name = new ALStringField();
  }

  /**
   * 
   * @param string
   */
  public void setName(String string) {
    name.setValue(string);
  }

  /**
   * 
   * @param firstName
   * @param lastName
   */
  public void setAliasName(String firstName, String lastName) {
    alias_name.setValue(new StringBuffer().append(lastName).append(" ")
      .append(firstName).toString());
  }

  /**
   * 
   * @return
   */
  public ALStringField getName() {
    return name;
  }

  /**
   * 
   * @return
   */
  public ALStringField getAliasName() {
    return alias_name;
  }

  /**
   * @return
   */
  public ALNumberField getUserId() {
    return user_id;
  }

  /**
   * @param field
   */
  public void setUserId(int number) {
    user_id.setValue(number);
  }

}
