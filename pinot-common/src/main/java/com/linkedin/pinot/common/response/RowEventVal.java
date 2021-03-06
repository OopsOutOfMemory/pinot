/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.linkedin.pinot.common.response;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class RowEventVal extends org.apache.thrift.TUnion<RowEventVal, RowEventVal._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RowEventVal");
  private static final org.apache.thrift.protocol.TField LONG_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("longVal", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField STRING_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("stringVal", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DOUBLE_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("doubleVal", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField LONG_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("longSet", org.apache.thrift.protocol.TType.SET, (short)4);
  private static final org.apache.thrift.protocol.TField STRING_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("stringSet", org.apache.thrift.protocol.TType.SET, (short)5);
  private static final org.apache.thrift.protocol.TField DOUBLE_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("doubleSet", org.apache.thrift.protocol.TType.SET, (short)6);
  private static final org.apache.thrift.protocol.TField LONG_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("longList", org.apache.thrift.protocol.TType.LIST, (short)7);
  private static final org.apache.thrift.protocol.TField STRING_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("stringList", org.apache.thrift.protocol.TType.LIST, (short)8);
  private static final org.apache.thrift.protocol.TField DOUBLE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("doubleList", org.apache.thrift.protocol.TType.LIST, (short)9);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LONG_VAL((short)1, "longVal"),
    STRING_VAL((short)2, "stringVal"),
    DOUBLE_VAL((short)3, "doubleVal"),
    LONG_SET((short)4, "longSet"),
    STRING_SET((short)5, "stringSet"),
    DOUBLE_SET((short)6, "doubleSet"),
    LONG_LIST((short)7, "longList"),
    STRING_LIST((short)8, "stringList"),
    DOUBLE_LIST((short)9, "doubleList");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LONG_VAL
          return LONG_VAL;
        case 2: // STRING_VAL
          return STRING_VAL;
        case 3: // DOUBLE_VAL
          return DOUBLE_VAL;
        case 4: // LONG_SET
          return LONG_SET;
        case 5: // STRING_SET
          return STRING_SET;
        case 6: // DOUBLE_SET
          return DOUBLE_SET;
        case 7: // LONG_LIST
          return LONG_LIST;
        case 8: // STRING_LIST
          return STRING_LIST;
        case 9: // DOUBLE_LIST
          return DOUBLE_LIST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LONG_VAL, new org.apache.thrift.meta_data.FieldMetaData("longVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STRING_VAL, new org.apache.thrift.meta_data.FieldMetaData("stringVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOUBLE_VAL, new org.apache.thrift.meta_data.FieldMetaData("doubleVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LONG_SET, new org.apache.thrift.meta_data.FieldMetaData("longSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.STRING_SET, new org.apache.thrift.meta_data.FieldMetaData("stringSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.DOUBLE_SET, new org.apache.thrift.meta_data.FieldMetaData("doubleSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.LONG_LIST, new org.apache.thrift.meta_data.FieldMetaData("longList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.STRING_LIST, new org.apache.thrift.meta_data.FieldMetaData("stringList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.DOUBLE_LIST, new org.apache.thrift.meta_data.FieldMetaData("doubleList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RowEventVal.class, metaDataMap);
  }

  public RowEventVal() {
    super();
  }

  public RowEventVal(_Fields setField, Object value) {
    super(setField, value);
  }

  public RowEventVal(RowEventVal other) {
    super(other);
  }
  public RowEventVal deepCopy() {
    return new RowEventVal(this);
  }

  public static RowEventVal longVal(long value) {
    RowEventVal x = new RowEventVal();
    x.setLongVal(value);
    return x;
  }

  public static RowEventVal stringVal(String value) {
    RowEventVal x = new RowEventVal();
    x.setStringVal(value);
    return x;
  }

  public static RowEventVal doubleVal(double value) {
    RowEventVal x = new RowEventVal();
    x.setDoubleVal(value);
    return x;
  }

  public static RowEventVal longSet(Set<Long> value) {
    RowEventVal x = new RowEventVal();
    x.setLongSet(value);
    return x;
  }

  public static RowEventVal stringSet(Set<String> value) {
    RowEventVal x = new RowEventVal();
    x.setStringSet(value);
    return x;
  }

  public static RowEventVal doubleSet(Set<Double> value) {
    RowEventVal x = new RowEventVal();
    x.setDoubleSet(value);
    return x;
  }

  public static RowEventVal longList(List<Long> value) {
    RowEventVal x = new RowEventVal();
    x.setLongList(value);
    return x;
  }

  public static RowEventVal stringList(List<String> value) {
    RowEventVal x = new RowEventVal();
    x.setStringList(value);
    return x;
  }

  public static RowEventVal doubleList(List<Double> value) {
    RowEventVal x = new RowEventVal();
    x.setDoubleList(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case LONG_VAL:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'longVal', but got " + value.getClass().getSimpleName());
      case STRING_VAL:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'stringVal', but got " + value.getClass().getSimpleName());
      case DOUBLE_VAL:
        if (value instanceof Double) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Double for field 'doubleVal', but got " + value.getClass().getSimpleName());
      case LONG_SET:
        if (value instanceof Set) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Set<Long> for field 'longSet', but got " + value.getClass().getSimpleName());
      case STRING_SET:
        if (value instanceof Set) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Set<String> for field 'stringSet', but got " + value.getClass().getSimpleName());
      case DOUBLE_SET:
        if (value instanceof Set) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Set<Double> for field 'doubleSet', but got " + value.getClass().getSimpleName());
      case LONG_LIST:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<Long> for field 'longList', but got " + value.getClass().getSimpleName());
      case STRING_LIST:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<String> for field 'stringList', but got " + value.getClass().getSimpleName());
      case DOUBLE_LIST:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<Double> for field 'doubleList', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case LONG_VAL:
          if (field.type == LONG_VAL_FIELD_DESC.type) {
            Long longVal;
            longVal = iprot.readI64();
            return longVal;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRING_VAL:
          if (field.type == STRING_VAL_FIELD_DESC.type) {
            String stringVal;
            stringVal = iprot.readString();
            return stringVal;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLE_VAL:
          if (field.type == DOUBLE_VAL_FIELD_DESC.type) {
            Double doubleVal;
            doubleVal = iprot.readDouble();
            return doubleVal;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LONG_SET:
          if (field.type == LONG_SET_FIELD_DESC.type) {
            Set<Long> longSet;
            {
              org.apache.thrift.protocol.TSet _set108 = iprot.readSetBegin();
              longSet = new HashSet<Long>(2*_set108.size);
              long _elem109;
              for (int _i110 = 0; _i110 < _set108.size; ++_i110)
              {
                _elem109 = iprot.readI64();
                longSet.add(_elem109);
              }
              iprot.readSetEnd();
            }
            return longSet;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRING_SET:
          if (field.type == STRING_SET_FIELD_DESC.type) {
            Set<String> stringSet;
            {
              org.apache.thrift.protocol.TSet _set111 = iprot.readSetBegin();
              stringSet = new HashSet<String>(2*_set111.size);
              String _elem112;
              for (int _i113 = 0; _i113 < _set111.size; ++_i113)
              {
                _elem112 = iprot.readString();
                stringSet.add(_elem112);
              }
              iprot.readSetEnd();
            }
            return stringSet;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLE_SET:
          if (field.type == DOUBLE_SET_FIELD_DESC.type) {
            Set<Double> doubleSet;
            {
              org.apache.thrift.protocol.TSet _set114 = iprot.readSetBegin();
              doubleSet = new HashSet<Double>(2*_set114.size);
              double _elem115;
              for (int _i116 = 0; _i116 < _set114.size; ++_i116)
              {
                _elem115 = iprot.readDouble();
                doubleSet.add(_elem115);
              }
              iprot.readSetEnd();
            }
            return doubleSet;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LONG_LIST:
          if (field.type == LONG_LIST_FIELD_DESC.type) {
            List<Long> longList;
            {
              org.apache.thrift.protocol.TList _list117 = iprot.readListBegin();
              longList = new ArrayList<Long>(_list117.size);
              long _elem118;
              for (int _i119 = 0; _i119 < _list117.size; ++_i119)
              {
                _elem118 = iprot.readI64();
                longList.add(_elem118);
              }
              iprot.readListEnd();
            }
            return longList;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRING_LIST:
          if (field.type == STRING_LIST_FIELD_DESC.type) {
            List<String> stringList;
            {
              org.apache.thrift.protocol.TList _list120 = iprot.readListBegin();
              stringList = new ArrayList<String>(_list120.size);
              String _elem121;
              for (int _i122 = 0; _i122 < _list120.size; ++_i122)
              {
                _elem121 = iprot.readString();
                stringList.add(_elem121);
              }
              iprot.readListEnd();
            }
            return stringList;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLE_LIST:
          if (field.type == DOUBLE_LIST_FIELD_DESC.type) {
            List<Double> doubleList;
            {
              org.apache.thrift.protocol.TList _list123 = iprot.readListBegin();
              doubleList = new ArrayList<Double>(_list123.size);
              double _elem124;
              for (int _i125 = 0; _i125 < _list123.size; ++_i125)
              {
                _elem124 = iprot.readDouble();
                doubleList.add(_elem124);
              }
              iprot.readListEnd();
            }
            return doubleList;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case LONG_VAL:
        Long longVal = (Long)value_;
        oprot.writeI64(longVal);
        return;
      case STRING_VAL:
        String stringVal = (String)value_;
        oprot.writeString(stringVal);
        return;
      case DOUBLE_VAL:
        Double doubleVal = (Double)value_;
        oprot.writeDouble(doubleVal);
        return;
      case LONG_SET:
        Set<Long> longSet = (Set<Long>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, longSet.size()));
          for (long _iter126 : longSet)
          {
            oprot.writeI64(_iter126);
          }
          oprot.writeSetEnd();
        }
        return;
      case STRING_SET:
        Set<String> stringSet = (Set<String>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, stringSet.size()));
          for (String _iter127 : stringSet)
          {
            oprot.writeString(_iter127);
          }
          oprot.writeSetEnd();
        }
        return;
      case DOUBLE_SET:
        Set<Double> doubleSet = (Set<Double>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.DOUBLE, doubleSet.size()));
          for (double _iter128 : doubleSet)
          {
            oprot.writeDouble(_iter128);
          }
          oprot.writeSetEnd();
        }
        return;
      case LONG_LIST:
        List<Long> longList = (List<Long>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, longList.size()));
          for (long _iter129 : longList)
          {
            oprot.writeI64(_iter129);
          }
          oprot.writeListEnd();
        }
        return;
      case STRING_LIST:
        List<String> stringList = (List<String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, stringList.size()));
          for (String _iter130 : stringList)
          {
            oprot.writeString(_iter130);
          }
          oprot.writeListEnd();
        }
        return;
      case DOUBLE_LIST:
        List<Double> doubleList = (List<Double>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, doubleList.size()));
          for (double _iter131 : doubleList)
          {
            oprot.writeDouble(_iter131);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case LONG_VAL:
          Long longVal;
          longVal = iprot.readI64();
          return longVal;
        case STRING_VAL:
          String stringVal;
          stringVal = iprot.readString();
          return stringVal;
        case DOUBLE_VAL:
          Double doubleVal;
          doubleVal = iprot.readDouble();
          return doubleVal;
        case LONG_SET:
          Set<Long> longSet;
          {
            org.apache.thrift.protocol.TSet _set132 = iprot.readSetBegin();
            longSet = new HashSet<Long>(2*_set132.size);
            long _elem133;
            for (int _i134 = 0; _i134 < _set132.size; ++_i134)
            {
              _elem133 = iprot.readI64();
              longSet.add(_elem133);
            }
            iprot.readSetEnd();
          }
          return longSet;
        case STRING_SET:
          Set<String> stringSet;
          {
            org.apache.thrift.protocol.TSet _set135 = iprot.readSetBegin();
            stringSet = new HashSet<String>(2*_set135.size);
            String _elem136;
            for (int _i137 = 0; _i137 < _set135.size; ++_i137)
            {
              _elem136 = iprot.readString();
              stringSet.add(_elem136);
            }
            iprot.readSetEnd();
          }
          return stringSet;
        case DOUBLE_SET:
          Set<Double> doubleSet;
          {
            org.apache.thrift.protocol.TSet _set138 = iprot.readSetBegin();
            doubleSet = new HashSet<Double>(2*_set138.size);
            double _elem139;
            for (int _i140 = 0; _i140 < _set138.size; ++_i140)
            {
              _elem139 = iprot.readDouble();
              doubleSet.add(_elem139);
            }
            iprot.readSetEnd();
          }
          return doubleSet;
        case LONG_LIST:
          List<Long> longList;
          {
            org.apache.thrift.protocol.TList _list141 = iprot.readListBegin();
            longList = new ArrayList<Long>(_list141.size);
            long _elem142;
            for (int _i143 = 0; _i143 < _list141.size; ++_i143)
            {
              _elem142 = iprot.readI64();
              longList.add(_elem142);
            }
            iprot.readListEnd();
          }
          return longList;
        case STRING_LIST:
          List<String> stringList;
          {
            org.apache.thrift.protocol.TList _list144 = iprot.readListBegin();
            stringList = new ArrayList<String>(_list144.size);
            String _elem145;
            for (int _i146 = 0; _i146 < _list144.size; ++_i146)
            {
              _elem145 = iprot.readString();
              stringList.add(_elem145);
            }
            iprot.readListEnd();
          }
          return stringList;
        case DOUBLE_LIST:
          List<Double> doubleList;
          {
            org.apache.thrift.protocol.TList _list147 = iprot.readListBegin();
            doubleList = new ArrayList<Double>(_list147.size);
            double _elem148;
            for (int _i149 = 0; _i149 < _list147.size; ++_i149)
            {
              _elem148 = iprot.readDouble();
              doubleList.add(_elem148);
            }
            iprot.readListEnd();
          }
          return doubleList;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case LONG_VAL:
        Long longVal = (Long)value_;
        oprot.writeI64(longVal);
        return;
      case STRING_VAL:
        String stringVal = (String)value_;
        oprot.writeString(stringVal);
        return;
      case DOUBLE_VAL:
        Double doubleVal = (Double)value_;
        oprot.writeDouble(doubleVal);
        return;
      case LONG_SET:
        Set<Long> longSet = (Set<Long>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, longSet.size()));
          for (long _iter150 : longSet)
          {
            oprot.writeI64(_iter150);
          }
          oprot.writeSetEnd();
        }
        return;
      case STRING_SET:
        Set<String> stringSet = (Set<String>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, stringSet.size()));
          for (String _iter151 : stringSet)
          {
            oprot.writeString(_iter151);
          }
          oprot.writeSetEnd();
        }
        return;
      case DOUBLE_SET:
        Set<Double> doubleSet = (Set<Double>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.DOUBLE, doubleSet.size()));
          for (double _iter152 : doubleSet)
          {
            oprot.writeDouble(_iter152);
          }
          oprot.writeSetEnd();
        }
        return;
      case LONG_LIST:
        List<Long> longList = (List<Long>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, longList.size()));
          for (long _iter153 : longList)
          {
            oprot.writeI64(_iter153);
          }
          oprot.writeListEnd();
        }
        return;
      case STRING_LIST:
        List<String> stringList = (List<String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, stringList.size()));
          for (String _iter154 : stringList)
          {
            oprot.writeString(_iter154);
          }
          oprot.writeListEnd();
        }
        return;
      case DOUBLE_LIST:
        List<Double> doubleList = (List<Double>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, doubleList.size()));
          for (double _iter155 : doubleList)
          {
            oprot.writeDouble(_iter155);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case LONG_VAL:
        return LONG_VAL_FIELD_DESC;
      case STRING_VAL:
        return STRING_VAL_FIELD_DESC;
      case DOUBLE_VAL:
        return DOUBLE_VAL_FIELD_DESC;
      case LONG_SET:
        return LONG_SET_FIELD_DESC;
      case STRING_SET:
        return STRING_SET_FIELD_DESC;
      case DOUBLE_SET:
        return DOUBLE_SET_FIELD_DESC;
      case LONG_LIST:
        return LONG_LIST_FIELD_DESC;
      case STRING_LIST:
        return STRING_LIST_FIELD_DESC;
      case DOUBLE_LIST:
        return DOUBLE_LIST_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public long getLongVal() {
    if (getSetField() == _Fields.LONG_VAL) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'longVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLongVal(long value) {
    setField_ = _Fields.LONG_VAL;
    value_ = value;
  }

  public String getStringVal() {
    if (getSetField() == _Fields.STRING_VAL) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stringVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStringVal(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STRING_VAL;
    value_ = value;
  }

  public double getDoubleVal() {
    if (getSetField() == _Fields.DOUBLE_VAL) {
      return (Double)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'doubleVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDoubleVal(double value) {
    setField_ = _Fields.DOUBLE_VAL;
    value_ = value;
  }

  public Set<Long> getLongSet() {
    if (getSetField() == _Fields.LONG_SET) {
      return (Set<Long>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'longSet' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLongSet(Set<Long> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LONG_SET;
    value_ = value;
  }

  public Set<String> getStringSet() {
    if (getSetField() == _Fields.STRING_SET) {
      return (Set<String>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stringSet' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStringSet(Set<String> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STRING_SET;
    value_ = value;
  }

  public Set<Double> getDoubleSet() {
    if (getSetField() == _Fields.DOUBLE_SET) {
      return (Set<Double>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'doubleSet' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDoubleSet(Set<Double> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.DOUBLE_SET;
    value_ = value;
  }

  public List<Long> getLongList() {
    if (getSetField() == _Fields.LONG_LIST) {
      return (List<Long>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'longList' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLongList(List<Long> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LONG_LIST;
    value_ = value;
  }

  public List<String> getStringList() {
    if (getSetField() == _Fields.STRING_LIST) {
      return (List<String>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stringList' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStringList(List<String> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STRING_LIST;
    value_ = value;
  }

  public List<Double> getDoubleList() {
    if (getSetField() == _Fields.DOUBLE_LIST) {
      return (List<Double>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'doubleList' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDoubleList(List<Double> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.DOUBLE_LIST;
    value_ = value;
  }

  public boolean isSetLongVal() {
    return setField_ == _Fields.LONG_VAL;
  }


  public boolean isSetStringVal() {
    return setField_ == _Fields.STRING_VAL;
  }


  public boolean isSetDoubleVal() {
    return setField_ == _Fields.DOUBLE_VAL;
  }


  public boolean isSetLongSet() {
    return setField_ == _Fields.LONG_SET;
  }


  public boolean isSetStringSet() {
    return setField_ == _Fields.STRING_SET;
  }


  public boolean isSetDoubleSet() {
    return setField_ == _Fields.DOUBLE_SET;
  }


  public boolean isSetLongList() {
    return setField_ == _Fields.LONG_LIST;
  }


  public boolean isSetStringList() {
    return setField_ == _Fields.STRING_LIST;
  }


  public boolean isSetDoubleList() {
    return setField_ == _Fields.DOUBLE_LIST;
  }


  public boolean equals(Object other) {
    if (other instanceof RowEventVal) {
      return equals((RowEventVal)other);
    } else {
      return false;
    }
  }

  public boolean equals(RowEventVal other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(RowEventVal other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
