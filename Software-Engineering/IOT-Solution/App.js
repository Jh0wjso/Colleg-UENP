import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';
import { useState } from 'react';
import { StyleSheet, Text, View,TouchableOpacity, Image } from 'react-native';
import { TextInput } from 'react-native-gesture-handler';
import { MaterialCommunityIcons } from '@expo/vector-icons';

function Home({ navigation }){
  const[lampState, setLampState] = useState(false);

  return (
    <View style={styles.container}>
        <View style={styles.lightContent}>
          <View style={styles.left}>
            <MaterialCommunityIcons name="lamp" color={'red'} size={50} />
          </View>
          <View style={styles.right}>
            <TouchableOpacity style={styles.buttonRegister} onPress = {() => navigation.navigate(' ')} >
              <Text style={styles.textRegister}>Conectar Luz</Text>
            </TouchableOpacity>
          </View>
        </View>

        <View style={styles.buttonContent}>
          <Text style={styles.textDisclaimer}>
            Clique no botao a baixo para mudar o estado da lampada.
          </Text>
          <TouchableOpacity
            onPress={() => {
              setLampState(!lampState);
              console.log(lampState);
            }}
          >
            {
            lampState ?
              <View style={styles.buttonLightOn}>
                <Text style={styles.textLightOn}>
                  Acesa
                </Text>
              </View>
              :
              <View style={styles.buttonLightOff}>
                <Text style={styles.textLightOff}>
                  Apagada
                </Text>
              </View>
              }
          </TouchableOpacity>
        </View>
    </View>
  );
}

function Cadastro(){
  return(
    <View style={styles.fullContainerCadastro}>
    <Text style={styles.textRegister}> Conecte-se </Text>
      <View style={styles.containerCadastro}>
        <TextInput style={styles.input}
          placeholder="Nome"
        />
        <TouchableOpacity style={styles.cadastrar}>
          <Text>
            <MaterialCommunityIcons name="account-circle" color={'red'} size={50} />
          </Text>
        </TouchableOpacity>
      </View>
      <View style={styles.containerCadastro}>
        <TextInput style={styles.input}
          placeholder="Senha"
        />
        <TouchableOpacity style={styles.cadastrar}>
          <Text>
            <MaterialCommunityIcons name="lock" color={'red'} size={50} />
          </Text>
        </TouchableOpacity>
      </View>
      <View style={styles.containerCadastro}>
        <TextInput style={styles.input}
          placeholder="IP-Lampada"
        />
        <TouchableOpacity style={styles.cadastrar}>
          <Text>
            <MaterialCommunityIcons name="arrow-right-drop-circle" color={'red'} size={50} />
          </Text>
        </TouchableOpacity>
      </View>
    </View>
  );
}

const Stack = createStackNavigator();

export default function App() {
  return(
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name='' component={Home}/>
        <Stack.Screen name=' ' component={Cadastro} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',

  },
  buttonRegister:{
    backgroundColor:'red',
    width:200,
    height:60,
    borderRadius:10,
    alignItems:'center',
    justifyContent:'center',
  },
  textRegister:{
    fontWeight:'bold',
    fontSize:25,
    color:'white',
  },
  right:{
    width:"40%",
    alignItems: 'flex-end'
  },

  left:{
    width: '60%',
    alignItems: 'flex-start',
    justifyContent: 'center',
    marginRight: 15
  },

  buttonLightOn:{
    backgroundColor:'green',
    width:200,
    height:200,
    borderRadius:100,
    alignItems:'center',
    justifyContent:'center',
  },
  textLightOn:{
    fontWeight:'bold',
    fontSize:25,
    color:'white',

  },

  buttonLightOff:{
    backgroundColor:'red',
    width:200,
    height:200,
    borderRadius:100,
    alignItems:'center',
    justifyContent:'center',
  },
  textLightOff:{
    fontWeight:'bold',
    fontSize:25,
    color:'white',

  },

  lightContent:{
    width: '70%',
    flexDirection: 'row',
    justifyContent: 'space-between',
    paddingBottom: 20,
  },

  buttonContent:{
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#3F3E3E',
    width: '100%',
    borderRadius: 50
  },

  textDisclaimer:{
    fontWeight: 'bold',
    fontSize: 20,
    textAlign: 'center',
    marginBottom: 20,
    color: '#fff'
  },

  containerCadastro:{
    justifyContent: 'center',
    alignItems: 'center',
    flexDirection: 'row'
  },

  fullContainerCadastro:{
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    flexDirection: 'column',
    backgroundColor: 'gray',
  },
  
  input:{
    width:"70%",
    borderRadius: 10,
    backgroundColor:"#f6f6f6",
    height: 60,
    margin:12,
    paddingLeft:10,
  },
  cadastrar:{
    width: 60,
    height: 60,
    borderRadius: 10,
    backgroundColor: '#f6f6f6',
    justifyContent: 'center',
    alignItems: 'center'
  }
});
