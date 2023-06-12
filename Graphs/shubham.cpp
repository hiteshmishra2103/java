#include<iostream>
#include<list>
 using namespace std;
 class graph{
    private:
    int v;
    list<int> *l;
    public:
    graph(int v){
        this->v=v;
        l =new list<int>[v];
    }
    void add_edge(int x,int y){
        l[x].push_back(y);
        l[y].push_back(x);
    }
    void printlist(){
        for(int i=0;i<v;i++){
            cout<<i<<" : ";
            for(auto j:l[i]){
                cout<<j<<" ";
                }
                cout<<endl;
                }
                }
        };
 int main(){
    graph g(5);
    g.add_edge(0,1);    
    g.add_edge(1,2);
    g.add_edge(2,3);
     g.add_edge(3,4);    
    g.add_edge(4,5);
    g.add_edge(1,4);
    g.printlist();
    return 0;
 }