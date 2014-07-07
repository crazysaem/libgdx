package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.graphics.g3d.Attribute;

/**
 * Created by crazysaem on 20.06.2014.
 */
public class UVOffsetAttribute extends Attribute
{
  public static final String UVOffsetAlias = "UVOffset";
  public static final long Type = register(UVOffsetAlias);

  public float u;
  public float v;

  public UVOffsetAttribute(float u, float v)
  {
    super(Type);

    this.u = u;
    this.v = v;
  }

  @Override
  public Attribute copy()
  {
    return new UVOffsetAttribute(u, v);
  }

  @Override
  protected boolean equals(Attribute other)
  {
    return ((UVOffsetAttribute)other).u == u && ((UVOffsetAttribute)other).v == v;
  }
}
