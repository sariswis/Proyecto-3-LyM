// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Lexer202310.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Lexer202310 {
  public static String currentString=null;
  static {
    int $line=0;
    $line=3;
    $try:try {
      currentString=$defaultValue(String.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static GArrayList images=null;
  static {
    int $line=0;
    $line=4;
    $try:try {
      images=$invokeConstructor(GArrayList.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet allSymbols=null;
  static {
    int $line=0;
    $line=6;
    $try:try {
      allSymbols=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet keyWords=null;
  static {
    int $line=0;
    $line=7;
    $try:try {
      keyWords=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet skipChars=null;
  static {
    int $line=0;
    $line=8;
    $try:try {
      skipChars=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet preKW=null;
  static {
    int $line=0;
    $line=10;
    $try:try {
      preKW=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet preOps=null;
  static {
    int $line=0;
    $line=11;
    $try:try {
      preOps=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet StartOps=null;
  static {
    int $line=0;
    $line=13;
    $try:try {
      StartOps=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet Symbols1=null;
  static {
    int $line=0;
    $line=14;
    $try:try {
      Symbols1=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet CharsSymbols1=null;
  static {
    int $line=0;
    $line=16;
    $try:try {
      CharsSymbols1=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet alphaUpper=null;
  static {
    int $line=0;
    $line=18;
    $try:try {
      alphaUpper=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet alphaLower=null;
  static {
    int $line=0;
    $line=19;
    $try:try {
      alphaLower=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet digits=null;
  static {
    int $line=0;
    $line=20;
    $try:try {
      digits=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet alphaNum=null;
  static {
    int $line=0;
    $line=22;
    $try:try {
      alphaNum=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet Out=null;
  static {
    int $line=0;
    $line=24;
    $try:try {
      Out=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static Boolean diffIdents=null;
  static {
    int $line=0;
    $line=25;
    $try:try {
      diffIdents=$defaultValue(Boolean.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static ISet Ids=null;
  static {
    int $line=0;
    $line=27;
    $try:try {
      Ids=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static GHashTableMap translation=null;
  static {
    int $line=0;
    $line=28;
    $try:try {
      translation=$invokeConstructor(GHashTableMap.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,null,$line);
    }
  }
  public static Object chars(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      int $v3=$int(0);
      int $v4=$int($invokeMethod("length",string,new Object[]{}))-1;
      $v2:for (int i=$v3; i<=$v4; i++) {
        $v1.add($invokeMethod("charAt",string,new Object[]{i}));
      }
      $result=$v1;
      if (true) break $try;
      $line=30;
      $rethrow(new RuntimeException("The function \"chars(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"chars",$line);
    }
    return $result;
  }
  public static Object charsStrings(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v5=$newSet(GCollections.emptySet());
      $v6:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v5.union(GCollections.unmodifiableSet(((java.lang.Iterable)(Lexer202310.chars(s)))));
      }
      $result=$v5;
      if (true) break $try;
      $line=32;
      $rethrow(new RuntimeException("The function \"charsStrings(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"charsStrings",$line);
    }
    return $result;
  }
  public static Object elements(Object array) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v7=$newSet();
      int $v9=$int(0);
      int $v10=$int($opAbsolY(array))-1;
      $v8:for (int i=$v9; i<=$v10; i++) {
        $v7.add($getArrayValue(array,new Object[]{i}));
      }
      $result=$v7;
      if (true) break $try;
      $line=34;
      $rethrow(new RuntimeException("The function \"elements(array:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"elements",$line);
    }
    return $result;
  }
  public static Object prefixes(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v11=$newSet();
      int $v13=$int(1);
      int $v14=$int($invokeMethod("length",string,new Object[]{}));
      $v12:for (int i=$v13; i<=$v14; i++) {
        $v11.add($invokeMethod("substring",string,new Object[]{0,i}));
      }
      $result=$v11;
      if (true) break $try;
      $line=36;
      $rethrow(new RuntimeException("The function \"prefixes(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"prefixes",$line);
    }
    return $result;
  }
  public static Object splits(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v15=$newSet();
      int $v17=$int(1);
      int $v18=$int($opSubtrY($invokeMethod("length",string,new Object[]{}),1));
      $v16:for (int i=$v17; i<=$v18; i++) {
        $v15.add(GCollections.asList($invokeMethod("substring",string,new Object[]{0,i}),$invokeMethod("substring",string,new Object[]{i,$invokeMethod("length",string,new Object[]{})})));
      }
      $result=$v15;
      if (true) break $try;
      $line=37;
      $rethrow(new RuntimeException("The function \"splits(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"splits",$line);
    }
    return $result;
  }
  public static Object allPrefixes(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v19=$newSet(GCollections.emptySet());
      $v20:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v19.union(GCollections.unmodifiableSet(((java.lang.Iterable)(Lexer202310.prefixes(s)))));
      }
      $result=$v19;
      if (true) break $try;
      $line=39;
      $rethrow(new RuntimeException("The function \"allPrefixes(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"allPrefixes",$line);
    }
    return $result;
  }
  public static Object translationGet(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result=(($bool((($opEqualY($opAbsolY(q),1)&&$opMembrY(q,Symbols1))&&!$opEqualY(q,'\n'))))?(q):(((gold.structures.map.GHashTableMap)translation).get(q)));
      if (true) break $try;
      $line=41;
      $rethrow(new RuntimeException("The function \"translationGet(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"translationGet",$line);
    }
    return $result;
  }
  public static Object runLexer(Object M, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=44;
      currentString=$cast(String.class,$fix(""));
      $line=45;
      images=$cast(GArrayList.class,$fix($invokeConstructor(GArrayList.class,new Object[]{})));
      $line=46;
      Object result=$fix($invokeMethod("acceptsString",M,new Object[]{input}));
      $line=47;
      $result=GCollections.asList(result,images);
      if (true) break $try;
      $line=48;
      $rethrow(new RuntimeException("The function \"runLexer(M:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"runLexer",$line);
    }
    return $result;
  }
  public static Object problems(String q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=51;
      if ($opMembrY(q,allSymbols)) {
        $line=51;
        $result=false;
        if (true) break $try;
      }
      else {
        $line=52;
        if ($opLessqY($opAbsolY(q),1)) {
          $line=52;
          $result=true;
          if (true) break $try;
        }
        else {
          $line=54;
          for (Object $v21:GCollections.unmodifiableCollection(Lexer202310.splits(q))) {
            java.util.Iterator $v22=GCollections.unmodifiableCollection($v21).iterator();
            Object s=$v22.next();
            Object t=$v22.next();
            $line=55;
            if ((!$bool(Lexer202310.problems($cast(java.lang.String.class,s)))&&!$bool(Lexer202310.problems($cast(java.lang.String.class,t))))) {
              $line=55;
              $result=false;
              if (true) break $try;
            }
          }
          $line=57;
          $result=true;
          if (true) break $try;
        }
      }
      $line=59;
      $rethrow(new RuntimeException("The function \"problems(q:String)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"problems",$line);
    }
    return $result;
  }
  public static Object translationPreOps(Object state) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=62;
      Object x=null;
      Object y=null;
      $line=63;
      String q=null;
      q=$defaultValue(String.class);
      $line=64;
      q=$cast(String.class,$fix(state));
      $line=65;
      Object n=$fix(((java.lang.String)q).length());
      $line=66;
      if ($opEqualY(n,0)) {
        $line=66;
        $result="";
        if (true) break $try;
      }
      else {
        $line=67;
        if ($opMembrY(q,allSymbols)) {
          $line=68;
          ((gold.structures.list.GArrayList)images).add(q);
          $line=69;
          $result=Lexer202310.translationGet(q);
          if (true) break $try;
        }
        else {
          $line=70;
          if ($opEqualY(n,1)) {
            $line=70;
            $result="";
            if (true) break $try;
          }
          else {
            $line=72;
            for (Object $v23:GCollections.unmodifiableCollection(Lexer202310.splits(q))) {
              java.util.Iterator $v24=GCollections.unmodifiableCollection($v23).iterator();
              Object s=$v24.next();
              Object t=$v24.next();
              $line=73;
              x=$fix(Lexer202310.translationPreOps(s));
              $line=74;
              y=$fix(Lexer202310.translationPreOps(t));
              $line=75;
              if ((!$opEqualY(x,"")&&!$opEqualY(y,""))) {
                $line=76;
                $result=$opAdditY(x,y);
                if (true) break $try;
              }
            }
            $line=78;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=80;
      $rethrow(new RuntimeException("The function \"translationPreOps(state:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"translationPreOps",$line);
    }
    return $result;
  }
  public static ITransducer createLexer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=83;
      Lexer202310.initialize();
      $line=85;
      preOps=$cast(ISet.class,$fix(Lexer202310.allPrefixes(allSymbols)));
      $line=86;
      preKW=$cast(ISet.class,$fix(Lexer202310.allPrefixes(keyWords)));
      $line=87;
      gold.structures.set.ISet $v25=$newSet(GCollections.emptySet());
      $v26:for (Object x:GCollections.unmodifiableCollection(allSymbols)) {
        $v25.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($invokeMethod("charAt",x,new Object[]{0}))))));
      }
      StartOps=$cast(ISet.class,$fix($v25));
      $line=88;
      gold.structures.set.ISet $v27=$newSet(GCollections.emptySet());
      $v28:for (Object x:GCollections.unmodifiableCollection(StartOps)) {
        $v27.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($opAdditY("",x))))));
      }
      Symbols1=$cast(ISet.class,$fix($opInterY($v27,allSymbols)));
      $line=89;
      gold.structures.set.ISet $v29=$newSet(GCollections.emptySet());
      $v30:for (Object x:GCollections.unmodifiableCollection(Symbols1)) {
        $v29.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($invokeMethod("charAt",x,new Object[]{0}))))));
      }
      CharsSymbols1=$cast(ISet.class,$fix($v29));
      $line=90;
      gold.structures.set.ISet $v31=$newSet(GCollections.emptySet());
      $v32:for (Object x:GCollections.unmodifiableCollection(((gold.structures.map.GHashTableMap)translation).values())) {
        $v31.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet(x)))));
      }
      Out=$cast(ISet.class,$fix($opUnionY(CharsSymbols1,$v31)));
      $line=92;
      System.out.println($message(new Object[]{Out}));
      $line=93;
      Ids=$cast(ISet.class,$fix(GCollections.asSet("IdU","IdL")));
      $line=95;
      Object Q=$fix($opUnionY($opUnionY(GCollections.asSet("INIT","IdU","Num","Err","IdL"),preKW),preOps));
      $line=97;
      System.out.println($message(new Object[]{Q}));
      $line=99;
      Object \u03A3=$fix($opUnionY($opUnionY($opUnionY(alphaNum,Lexer202310.charsStrings(allSymbols)),skipChars),GCollections.asSet(':','-')));
      $line=102;
      Object q_0=$fix("INIT");
      $line=103;
      Object F=$fix(GCollections.asSet("INIT"));
      $line=104;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,Out,q_0,F,new GMethod(Lexer202310.class,"\u03B4"),new GMethod(Lexer202310.class,"g"),new GMethod(Lexer202310.class,"h")});
      if (true) break $try;
      $line=105;
      $rethrow(new RuntimeException("The function \"createLexer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"createLexer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object state, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=108;
      String q=null;
      q=$defaultValue(String.class);
      $line=109;
      q=$cast(String.class,$fix(state));
      $line=111;
      if ($opEqualY(q,"Err")) {
        $line=111;
        $result="Err";
        if (true) break $try;
      }
      else {
        $line=112;
        if ($opMembrY(q,preOps)) {
          $line=113;
          if ($opMembrY($opAdditY(q,\u03C3),preOps)) {
            $line=113;
            $result=$opAdditY(q,\u03C3);
            if (true) break $try;
          }
          else {
            $line=114;
            if ($bool(Lexer202310.problems($cast(java.lang.String.class,q)))) {
              $line=114;
              $result="Err";
              if (true) break $try;
            }
            else {
              $line=115;
              if ($opMembrY(\u03C3,skipChars)) {
                $line=115;
                $result="INIT";
                if (true) break $try;
              }
              else {
                $line=116;
                if ($opMembrY(\u03C3,$opIntvlY('0','9'))) {
                  $line=116;
                  $result="Num";
                  if (true) break $try;
                }
                else {
                  $line=117;
                  if ($opMembrY($opAdditY("",\u03C3),preKW)) {
                    $line=117;
                    $result=$opAdditY("",\u03C3);
                    if (true) break $try;
                  }
                  else {
                    $line=118;
                    if ($opMembrY(\u03C3,alphaUpper)) {
                      $line=118;
                      $result="IdU";
                      if (true) break $try;
                    }
                    else {
                      $line=119;
                      if ($opMembrY(\u03C3,alphaLower)) {
                        $line=119;
                        $result="IdL";
                        if (true) break $try;
                      }
                      else {
                        $line=120;
                        if ($opMembrY($opAdditY("",\u03C3),preOps)) {
                          $line=120;
                          $result=$opAdditY("",\u03C3);
                          if (true) break $try;
                        }
                        else {
                          $line=121;
                          $result="Err";
                          if (true) break $try;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        else {
          $line=123;
          if (((($opMembrY(\u03C3,skipChars)&&$opMembrY(q,preKW))&&!$bool($opMembrY(q,keyWords)))&&$opEqualY(((java.lang.String)q).charAt($int(0)),':'))) {
            $line=123;
            $result="Err";
            if (true) break $try;
          }
          else {
            $line=124;
            if ($opMembrY(\u03C3,skipChars)) {
              $line=124;
              $result="INIT";
              if (true) break $try;
            }
            else {
              $line=125;
              if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                $line=125;
                $result="Num";
                if (true) break $try;
              }
              else {
                $line=126;
                if (($opEqualY(q,"INIT")&&$opMembrY($opAdditY("",\u03C3),preKW))) {
                  $line=126;
                  $result=$opAdditY("",\u03C3);
                  if (true) break $try;
                }
                else {
                  $line=127;
                  if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,alphaUpper))) {
                    $line=127;
                    $result="IdU";
                    if (true) break $try;
                  }
                  else {
                    $line=128;
                    if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,alphaLower))) {
                      $line=128;
                      $result="IdL";
                      if (true) break $try;
                    }
                    else {
                      $line=129;
                      if (($opEqualY(q,"INIT")&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                        $line=129;
                        $result=$opAdditY("",\u03C3);
                        if (true) break $try;
                      }
                      else {
                        $line=130;
                        if (($opMembrY(q,preKW)&&$opMembrY($opAdditY(q,\u03C3),preKW))) {
                          $line=130;
                          $result=$opAdditY(q,\u03C3);
                          if (true) break $try;
                        }
                        else {
                          $line=131;
                          if ((($opMembrY(q,preKW)&&$opMembrY(\u03C3,alphaNum))&&$opMembrY(((java.lang.String)q).charAt($int(0)),alphaUpper))) {
                            $line=131;
                            $result="IdU";
                            if (true) break $try;
                          }
                          else {
                            $line=132;
                            if ((($opMembrY(q,preKW)&&$opMembrY(\u03C3,alphaNum))&&$opMembrY(((java.lang.String)q).charAt($int(0)),alphaLower))) {
                              $line=132;
                              $result="IdL";
                              if (true) break $try;
                            }
                            else {
                              $line=133;
                              if (($opMembrY(q,preKW)&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                $line=133;
                                $result=$opAdditY("",\u03C3);
                                if (true) break $try;
                              }
                              else {
                                $line=134;
                                if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                                  $line=134;
                                  $result="Num";
                                  if (true) break $try;
                                }
                                else {
                                  $line=135;
                                  if (($opEqualY(q,"Num")&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                    $line=135;
                                    $result=$opAdditY("",\u03C3);
                                    if (true) break $try;
                                  }
                                  else {
                                    $line=136;
                                    if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,alphaNum))) {
                                      $line=136;
                                      $result="Err";
                                      if (true) break $try;
                                    }
                                    else {
                                      $line=137;
                                      if (($opMembrY(q,Ids)&&$opMembrY(\u03C3,alphaNum))) {
                                        $line=137;
                                        $result=q;
                                        if (true) break $try;
                                      }
                                      else {
                                        $line=138;
                                        if (($opMembrY(q,Ids)&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                          $line=138;
                                          $result=$opAdditY("",\u03C3);
                                          if (true) break $try;
                                        }
                                        else {
                                          $line=139;
                                          $result="Err";
                                          if (true) break $try;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=141;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=144;
      $result="";
      if (true) break $try;
      $line=145;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"g",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=148;
      String s=null;
      s=$defaultValue(String.class);
      $line=149;
      s=$cast(String.class,$fix((($bool($opEqualY(\u03C3,'\n')))?("\\n"):($opAdditY("",\u03C3)))));
      $line=151;
      if ($opMembrY(q,preOps)) {
        $line=152;
        if (($opMembrY(\u03C3,skipChars)&&$opMembrY(q,allSymbols))) {
          $line=153;
          ((gold.structures.list.GArrayList)images).add(currentString);
          $line=154;
          currentString=$cast(String.class,$fix(""));
          $line=155;
          $result=Lexer202310.translationGet(q);
          if (true) break $try;
        }
        else {
          $line=156;
          if ($opMembrY($opAdditY(q,\u03C3),preOps)) {
            $line=157;
            currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
            $line=158;
            $result="";
            if (true) break $try;
          }
          else {
            $line=159;
            if (($opMembrY(\u03C3,$opUnionY(StartOps,alphaNum))&&$opMembrY(q,allSymbols))) {
              $line=160;
              ((gold.structures.list.GArrayList)images).add(currentString);
              $line=161;
              currentString=$cast(String.class,$fix($opAdditY("",s)));
              $line=162;
              $result=Lexer202310.translationGet(q);
              if (true) break $try;
            }
            else {
              $line=163;
              if ($opMembrY(\u03C3,$opUnionY($opUnionY($opUnionY(StartOps,alphaNum),skipChars),GCollections.asSet(':')))) {
                $line=164;
                currentString=$cast(String.class,$fix($opAdditY("",s)));
                $line=165;
                $result=Lexer202310.translationPreOps(q);
                if (true) break $try;
              }
              else {
                $line=167;
                currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
                $line=168;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      else {
        $line=172;
        if ((!$opMembrY(q,GCollections.asSet("Err"))&&$opMembrY(\u03C3,$opUnionY(skipChars,StartOps)))) {
          $line=173;
          if ($opEqualY(q,"INIT")) {
            $line=174;
            currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,StartOps)))?(s):(""))));
            $line=175;
            $result="";
            if (true) break $try;
          }
          else {
            $line=176;
            if ($opEqualY(Lexer202310.translationGet(q),null)) {
              $line=178;
              ((gold.structures.list.GArrayList)images).add(currentString);
              $line=179;
              currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,$opUnionY(skipChars,StartOps))))?(s):(""))));
              $line=180;
              Object f=$fix($invokeMethod("charAt",q,new Object[]{0}));
              $line=181;
              if ($opMembrY(f,alphaUpper)) {
                $line=181;
                $result=Lexer202310.translationGet("IdU");
                if (true) break $try;
              }
              else {
                $line=182;
                if ($opMembrY(f,alphaLower)) {
                  $line=183;
                  $result=Lexer202310.translationGet("IdL");
                  if (true) break $try;
                }
                else {
                  $line=184;
                  $result=null;
                  if (true) break $try;
                }
              }
            }
            else {
              $line=187;
              ((gold.structures.list.GArrayList)images).add(currentString);
              $line=188;
              currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,$opUnionY(skipChars,StartOps))))?(s):(""))));
              $line=189;
              $result=Lexer202310.translationGet(q);
              if (true) break $try;
            }
          }
        }
        else {
          $line=192;
          currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
          $line=193;
          $result="";
          if (true) break $try;
        }
      }
      $line=195;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"h",$line);
    }
    return $result;
  }
  public static Object initialize() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=200;
      skipChars=$cast(ISet.class,$fix(GCollections.asSet(' ','\r','\t','\n','\f')));
      $line=201;
      alphaUpper=$cast(ISet.class,$fix($opIntvlY('A','Z')));
      $line=202;
      alphaLower=$cast(ISet.class,$fix($opIntvlY('a','z')));
      $line=203;
      digits=$cast(ISet.class,$fix($opIntvlY('0','9')));
      $line=204;
      alphaNum=$cast(ISet.class,$fix($opUnionY($opUnionY($opUnionY(alphaUpper,alphaLower),digits),GCollections.asSet('_'))));
      $line=205;
      keyWords=$cast(ISet.class,$fix(GCollections.asSet("ROBOT_R","VARS","PROCS","assignTo","goTo","move","turn","face","put","pick","moveToThe","moveInDir","jumpToThe","jumpInDir","nop","if","then","else","while","do","repeat","facing","canPut","canPick","canMoveInDir","canJumpInDir","canMoveToThe","canJumpToThe","not","left","right","around","north","south","east","west","balloons","chips","front","back")));
      $line=209;
      allSymbols=$cast(ISet.class,$fix(GCollections.asSet("[","]",",",":",";","|")));
      $line=218;
      ((gold.structures.map.GHashTableMap)translation).put("ROBOT_R",'R');
      $line=219;
      ((gold.structures.map.GHashTableMap)translation).put("VARS",'V');
      $line=220;
      ((gold.structures.map.GHashTableMap)translation).put("PROCS",'P');
      $line=223;
      ((gold.structures.map.GHashTableMap)translation).put("assignTo",'a');
      $line=224;
      ((gold.structures.map.GHashTableMap)translation).put("goTo",'g');
      $line=225;
      ((gold.structures.map.GHashTableMap)translation).put("move",'m');
      $line=226;
      ((gold.structures.map.GHashTableMap)translation).put("turn",'t');
      $line=227;
      ((gold.structures.map.GHashTableMap)translation).put("face",'f');
      $line=228;
      ((gold.structures.map.GHashTableMap)translation).put("put",'p');
      $line=229;
      ((gold.structures.map.GHashTableMap)translation).put("pick",'p');
      $line=230;
      ((gold.structures.map.GHashTableMap)translation).put("moveToThe",'o');
      $line=231;
      ((gold.structures.map.GHashTableMap)translation).put("jumpToThe",'o');
      $line=232;
      ((gold.structures.map.GHashTableMap)translation).put("moveInDir",'i');
      $line=233;
      ((gold.structures.map.GHashTableMap)translation).put("jumpInDir",'i');
      $line=234;
      ((gold.structures.map.GHashTableMap)translation).put("nop",'n');
      $line=237;
      ((gold.structures.map.GHashTableMap)translation).put("if",'I');
      $line=238;
      ((gold.structures.map.GHashTableMap)translation).put("then",'T');
      $line=239;
      ((gold.structures.map.GHashTableMap)translation).put("else",'E');
      $line=240;
      ((gold.structures.map.GHashTableMap)translation).put("while",'W');
      $line=241;
      ((gold.structures.map.GHashTableMap)translation).put("do",'D');
      $line=242;
      ((gold.structures.map.GHashTableMap)translation).put("repeat",'A');
      $line=245;
      ((gold.structures.map.GHashTableMap)translation).put("facing",'c');
      $line=246;
      ((gold.structures.map.GHashTableMap)translation).put("canPut",'u');
      $line=247;
      ((gold.structures.map.GHashTableMap)translation).put("canPick",'u');
      $line=248;
      ((gold.structures.map.GHashTableMap)translation).put("canMoveInDir",'r');
      $line=249;
      ((gold.structures.map.GHashTableMap)translation).put("canJumpInDir",'r');
      $line=250;
      ((gold.structures.map.GHashTableMap)translation).put("canMoveToThe",'h');
      $line=251;
      ((gold.structures.map.GHashTableMap)translation).put("canJumpToThe",'h');
      $line=252;
      ((gold.structures.map.GHashTableMap)translation).put("not",'!');
      $line=255;
      ((gold.structures.map.GHashTableMap)translation).put("left",'L');
      $line=256;
      ((gold.structures.map.GHashTableMap)translation).put("right",'L');
      $line=257;
      ((gold.structures.map.GHashTableMap)translation).put("around",'U');
      $line=258;
      ((gold.structures.map.GHashTableMap)translation).put("north",'O');
      $line=259;
      ((gold.structures.map.GHashTableMap)translation).put("south",'O');
      $line=260;
      ((gold.structures.map.GHashTableMap)translation).put("east",'O');
      $line=261;
      ((gold.structures.map.GHashTableMap)translation).put("west",'O');
      $line=262;
      ((gold.structures.map.GHashTableMap)translation).put("balloons",'X');
      $line=263;
      ((gold.structures.map.GHashTableMap)translation).put("chips",'X');
      $line=264;
      ((gold.structures.map.GHashTableMap)translation).put("front",'C');
      $line=265;
      ((gold.structures.map.GHashTableMap)translation).put("back",'C');
      $line=267;
      ((gold.structures.map.GHashTableMap)translation).put("IdL",'v');
      $line=268;
      ((gold.structures.map.GHashTableMap)translation).put("IdU",'v');
      $line=269;
      ((gold.structures.map.GHashTableMap)translation).put("Num",'#');
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202310.class,"initialize",$line);
    }
    return $result;
  }
}
