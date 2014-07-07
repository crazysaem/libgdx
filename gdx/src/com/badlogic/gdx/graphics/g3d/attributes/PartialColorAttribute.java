package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.graphics.g3d.Attribute;

/**
 * Created by crazysaem on 29.06.2014.
 */
public class PartialColorAttribute extends Attribute
{
  public static final String PartialColorAlias = "partialColor";
  public static final long Type = register(PartialColorAlias);

  public float x;
  public float y;

  public PartialColorAttribute(float x, float y)
  {
    super(Type);

    this.x = x;
    this.y = y;
  }

  @Override
  public Attribute copy()
  {
    return new PartialColorAttribute(x, y);
  }

  @Override
  protected boolean equals(Attribute other)
  {
    return ((PartialColorAttribute)other).x == x && ((PartialColorAttribute)other).y == y;
  }
}
